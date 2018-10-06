package com.mockito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mockito.service.WelcomePageDataProviderService;

@Controller
public class ViewReturnController {
	@Autowired
	private WelcomePageDataProviderService welcomePageDataProviderService;
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView displayWelcomePage(ModelAndView mav) {
		String displayData=welcomePageDataProviderService.welcomeDataProvider();
		mav.addObject("displaydata", displayData);
		mav.setViewName("Welcome");
		return mav;
	}
}
