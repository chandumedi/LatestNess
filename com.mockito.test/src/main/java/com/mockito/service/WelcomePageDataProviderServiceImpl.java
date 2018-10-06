package com.mockito.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mockito.db.PageTabs;

@Service
public class WelcomePageDataProviderServiceImpl implements WelcomePageDataProviderService{

	public String welcomeDataProvider() {
		String displayData="Welcome to Mackito Testing testing with GIT!";
		return displayData;
	}

	public ArrayList<PageTabs> getTabNames() {
		ArrayList<PageTabs> tabs=new ArrayList<PageTabs>();
		tabs.add(new PageTabs("HOME", "Shows home page"));
		tabs.add(new PageTabs("ABout", "About Institution"));
		tabs.add(new PageTabs("Courses", "Show all courses"));
		return tabs;
	}

}
