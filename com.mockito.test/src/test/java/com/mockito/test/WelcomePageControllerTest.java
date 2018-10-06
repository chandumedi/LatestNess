package com.mockito.test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.mockito.config.WebConfigurer;
import com.mockito.service.WelcomePageDataProviderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {WebConfigurer.class})
@WebAppConfiguration
public class WelcomePageControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
	private WelcomePageDataProviderService welcomePageDataProviderService;
	
	@Test
	public void testWelcomePage() throws Exception {
		String data="Welcome to Mackito Testing!";
		when(welcomePageDataProviderService.welcomeDataProvider()).thenReturn(data);
		
		mockMvc.perform(get("/welcome")).
		andExpect(status().isOk()).
		andExpect(view().name("Welcome")).
		andExpect(forwardedUrl("/WEB-INF/views/Welcome.jsp")).
		andExpect(model().attribute("displaydata",""));

        verify(welcomePageDataProviderService, times(1)).welcomeDataProvider();
        verifyNoMoreInteractions(welcomePageDataProviderService);
	}
}
