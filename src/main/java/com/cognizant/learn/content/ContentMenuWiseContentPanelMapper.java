package com.cognizant.learn.content;

import java.util.ArrayList;
import java.util.HashMap;

public class ContentMenuWiseContentPanelMapper {

	public static final String PHOENIX_LIFE_SUB_MENU_1 = "Setup Local Codebase";
	public static final String PHOENIX_LIFE_SUB_MENU_2 = "Build Your Project";
	public static final String PHOENIX_LIFE_SUB_MENU_3 = "Starting Weblogic Server";
	public static final String PHOENIX_LIFE_SUB_MENU_4 = "Deployment of Application";
	public static final String PHOENIX_LIFE_SUB_MENU_5 = "Login into Lifeportal";
	public static final String PHOENIX_LIFE_SUB_MENU_6 = "Issues & Fixes";
	public static final String PHOENIX_LIFE_SUB_MENU_7 = "Discussion";

	public static final int INTRODUCTION_CONTENT_ID = 0;
	public static final String INTRODUCTION_CONTENT_PANEL_NAME = " Introduction ";

	public static final int PHOENIX_LIFE_SETUP_CONTENT_ID = 1;
	public static final String PHOENIX_LIFE_SETUP_CONTENT_NAME = " Steps to run Phoenix-Life in WL12 ";

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

	public static final HashMap<Integer, ArrayList<String>> contentMenuWiseSubMenuList = new HashMap<Integer, ArrayList<String>>();

	static {

		ArrayList<String> subMenuList = new ArrayList<String>();
		contentMenuWiseSubMenuList.put(INTRODUCTION_CONTENT_ID, subMenuList);

		subMenuList = new ArrayList<String>();
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_1);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_2);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_3);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_4);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_5);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_6);
		subMenuList.add(PHOENIX_LIFE_SUB_MENU_7);

		contentMenuWiseSubMenuList.put(PHOENIX_LIFE_SETUP_CONTENT_ID, subMenuList);
	}

	public static final HashMap<String, Integer> phoenixLifeSubmenuWisePageNumberMapping = new HashMap<String, Integer>();
	static {
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_1, 1);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_2, 4);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_3, 9);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_4, 11);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_5, 16);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_6, 20);
		phoenixLifeSubmenuWisePageNumberMapping.put(PHOENIX_LIFE_SUB_MENU_7, 26);
	}

	

	public static final HashMap<Integer, HashMap<String, Integer>> contentIdVSSubmenuPageNumberMapping = new HashMap<Integer, HashMap<String, Integer>>();
	static {
		contentIdVSSubmenuPageNumberMapping.put(PHOENIX_LIFE_SETUP_CONTENT_ID, phoenixLifeSubmenuWisePageNumberMapping);
	}

}
