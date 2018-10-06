package com.mockito.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mockito.db.PageTabs;
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
	@RequestMapping(value="/showwithtabs",method=RequestMethod.GET)
	public ModelAndView pageWithTabs(ModelAndView model) {
		ArrayList<PageTabs>  tabs=welcomePageDataProviderService.getTabNames();
		model.addObject("tabsInfo", tabs);
		model.setViewName("tabsInfo");
		return model;
	}
}
