package com.cognizant.learn.content;

import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.cognizant.learn.content.phoenix.DisscussionFormPage;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage1;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage10;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage11;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage12;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage13;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage14;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage15;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage16;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage17;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage18;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage19;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage2;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage20;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage21;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage22;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage23;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage24;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage25;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage3;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage4;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage5;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage6;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage7;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage8;
import com.cognizant.learn.content.phoenix.PhoenixLifeSetUpContentPage9;
import com.cognizant.learn.utilities.ViewDetails;
import com.cognizant.learn.view.CLearnClient;

public class PhoenixLifeSetUpContentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7379485214220341621L;
	
	private final static Logger LOG = Logger.getLogger(CLearnClient.class);
	
	private int width, height;
	private HashMap<Integer, JPanel> indexWiseContentPanelMap;
	public static final int MAX_CONTENT_PAGE_COUNT = 27;
	
	public static Font HEADER_FONT;
	public static Font CONTENT_FONT;
	
	private int contentIndex = 1;
	
	public int getContentIndex() {
		return contentIndex;
	}

	public void setContentIndex(int contentIndex) {
		this.contentIndex = contentIndex;
	}
	
	public PhoenixLifeSetUpContentPanel(int width, int height) {

		this.width = width;
		this.height = height;
		
		updateLabelDependingSR();

		createPhoenixLifeContentMap();
		
		populatePhoenixLifeContentPanel();

		this.setName(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_NAME);
		this.setBorder(BorderFactory.createLineBorder(ViewDetails.CLEARN_CONTENT_HEADER_COLOR));
		this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
	}
	
	private void updateLabelDependingSR() {
		
		if(CLearnClient.FULL_SCREEN_WIDTH >=1900) {
			HEADER_FONT = ViewDetails.CLEARNF25B;
			CONTENT_FONT = ViewDetails.CLEARNF20;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1600) {
			HEADER_FONT = ViewDetails.CLEARNF20B;
			CONTENT_FONT = ViewDetails.CLEARNF20;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1400) {
			HEADER_FONT = ViewDetails.CLEARNF20B;
			CONTENT_FONT = ViewDetails.CLEARNF18;
		} else {
			HEADER_FONT = ViewDetails.CLEARNF20B;
			CONTENT_FONT = ViewDetails.CLEARNF18;
		}
	}

	public void populatePhoenixLifeContentPanel() {
		
		LOG.info(" populatePhoenixLifeContentPanel is : contentIndex " + contentIndex);

		if (indexWiseContentPanelMap.containsKey(contentIndex)) {

			this.removeAll();
			this.repaint();
			this.validate();

			this.add(indexWiseContentPanelMap.get(contentIndex));

			this.repaint();
			this.validate();
		}

	}
	
	public void createPhoenixLifeContentMap() {
		
		LOG.info(" createPhoenixLifeContentMap is called for the first time..");
		
		indexWiseContentPanelMap = new HashMap<Integer, JPanel>();
		indexWiseContentPanelMap.put(1, new PhoenixLifeSetUpContentPage1(width, height));
		indexWiseContentPanelMap.put(2, new PhoenixLifeSetUpContentPage2(width, height));
		indexWiseContentPanelMap.put(3, new PhoenixLifeSetUpContentPage3(width, height));
		indexWiseContentPanelMap.put(4, new PhoenixLifeSetUpContentPage4(width, height));
		indexWiseContentPanelMap.put(5, new PhoenixLifeSetUpContentPage5(width, height));
		indexWiseContentPanelMap.put(6, new PhoenixLifeSetUpContentPage6(width, height));
		indexWiseContentPanelMap.put(7, new PhoenixLifeSetUpContentPage7(width, height));
		indexWiseContentPanelMap.put(8, new PhoenixLifeSetUpContentPage8(width, height));
		indexWiseContentPanelMap.put(9, new PhoenixLifeSetUpContentPage9(width, height));
		indexWiseContentPanelMap.put(10, new PhoenixLifeSetUpContentPage10(width, height));
		indexWiseContentPanelMap.put(11, new PhoenixLifeSetUpContentPage11(width, height));
		indexWiseContentPanelMap.put(12, new PhoenixLifeSetUpContentPage12(width, height));
		indexWiseContentPanelMap.put(13, new PhoenixLifeSetUpContentPage13(width, height));
		indexWiseContentPanelMap.put(14, new PhoenixLifeSetUpContentPage14(width, height));
		indexWiseContentPanelMap.put(15, new PhoenixLifeSetUpContentPage15(width, height));
		indexWiseContentPanelMap.put(16, new PhoenixLifeSetUpContentPage16(width, height));
		indexWiseContentPanelMap.put(17, new PhoenixLifeSetUpContentPage17(width, height));
		indexWiseContentPanelMap.put(18, new PhoenixLifeSetUpContentPage18(width, height));
		indexWiseContentPanelMap.put(19, new PhoenixLifeSetUpContentPage19(width, height));
		indexWiseContentPanelMap.put(20, new PhoenixLifeSetUpContentPage20(width, height));
		indexWiseContentPanelMap.put(21, new PhoenixLifeSetUpContentPage21(width, height));
		indexWiseContentPanelMap.put(22, new PhoenixLifeSetUpContentPage22(width, height));
		indexWiseContentPanelMap.put(23, new PhoenixLifeSetUpContentPage23(width, height));
		indexWiseContentPanelMap.put(24, new PhoenixLifeSetUpContentPage24(width, height));
		indexWiseContentPanelMap.put(25, new PhoenixLifeSetUpContentPage25(width, height));
		indexWiseContentPanelMap.put(26, new DisscussionFormPage(width, height));
	}

	
	
}
