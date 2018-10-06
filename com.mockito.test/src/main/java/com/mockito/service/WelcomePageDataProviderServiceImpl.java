package com.mockito.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomePageDataProviderServiceImpl implements WelcomePageDataProviderService{

	public String welcomeDataProvider() {
		String displayData="Welcome to Mackito Testing testing with GIT!";
		return displayData;
	}

}
