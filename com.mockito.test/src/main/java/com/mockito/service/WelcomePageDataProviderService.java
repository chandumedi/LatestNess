package com.mockito.service;

import java.util.ArrayList;

import com.mockito.db.PageTabs;

public interface WelcomePageDataProviderService {
	public String welcomeDataProvider();

	public ArrayList<PageTabs> getTabNames();
}
