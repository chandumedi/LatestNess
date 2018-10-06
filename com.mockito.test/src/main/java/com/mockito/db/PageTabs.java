package com.mockito.db;

public class PageTabs {
private String tabName;
private String tabDesc;

public PageTabs(String tabName, String tabDesc) {
	super();
	this.tabName = tabName;
	this.tabDesc = tabDesc;
}
public String getTabName() {
	return tabName;
}
public void setTabName(String tabName) {
	this.tabName = tabName;
}
public String getTabDesc() {
	return tabDesc;
}
public void setTabDesc(String tabDesc) {
	this.tabDesc = tabDesc;
}
}
