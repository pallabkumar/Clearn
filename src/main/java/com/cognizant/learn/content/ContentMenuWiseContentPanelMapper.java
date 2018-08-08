package com.cognizant.learn.content;

import java.util.HashMap;

public class ContentMenuWiseContentPanelMapper {
	
	public static final String[] CONTENT_MENU_TEXT = {
												   " \u2022  Introduction",
												   " \u2022	  Steps to run Phoenix-Life in WL12"
												  };
	
	public static final int INTRODUCTION_CONTENT_ID = 0;
	public static final String INTRODUCTION_CONTENT_PANEL_NAME = "IntroductionContentPanel";
	
	public static final int PHOENIX_LIFE_SETUP_CONTENT_ID = 1;
	public static final String PHOENIX_LIFE_SETUP_CONTENT_NAME = "PhoenixLifeSetUpContentPanel";
	
	public static final HashMap<Integer, String> contentMenuWiseContentPanelMap = new HashMap<Integer, String>(); 
	
	static {
		contentMenuWiseContentPanelMap.put(INTRODUCTION_CONTENT_ID, INTRODUCTION_CONTENT_PANEL_NAME);
		contentMenuWiseContentPanelMap.put(PHOENIX_LIFE_SETUP_CONTENT_ID, PHOENIX_LIFE_SETUP_CONTENT_NAME);
	}
	
	public static final HashMap<String, Integer> contentPanelWiseContentMenuMap = new HashMap<String, Integer>(); 
	
	static {
		contentPanelWiseContentMenuMap.put(INTRODUCTION_CONTENT_PANEL_NAME, INTRODUCTION_CONTENT_ID);
		contentPanelWiseContentMenuMap.put(PHOENIX_LIFE_SETUP_CONTENT_NAME, PHOENIX_LIFE_SETUP_CONTENT_ID);
	}

}
