package com.cognizant.learn.content;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

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
	public static final int MAX_CONTENT_PAGE_COUNT = 17;
	
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

		createPhoenixLifeContentMap();

		populatePhoenixLifeContentPanelMap();

		this.setName(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_NAME);
		this.setBorder(BorderFactory.createLineBorder(ViewDetails.CLEARN_CONTENT_HEADER_COLOR));
		this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
	}

	public void populatePhoenixLifeContentPanelMap() {
		
		LOG.info(" populatePhoenixLifeContentPanelMap is : contentIndex " + contentIndex);

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
		indexWiseContentPanelMap.put(6, new PhoenixLifeSetUpContentPage7(width, height));
		indexWiseContentPanelMap.put(7, new PhoenixLifeSetUpContentPage8(width, height));
		indexWiseContentPanelMap.put(8, new PhoenixLifeSetUpContentPage9(width, height));
		indexWiseContentPanelMap.put(9, new PhoenixLifeSetUpContentPage10(width, height));
		indexWiseContentPanelMap.put(10, new PhoenixLifeSetUpContentPage11(width, height));
		indexWiseContentPanelMap.put(11, new PhoenixLifeSetUpContentPage12(width, height));
		indexWiseContentPanelMap.put(12, new PhoenixLifeSetUpContentPage13(width, height));
		indexWiseContentPanelMap.put(13, new PhoenixLifeSetUpContentPage14(width, height));
		indexWiseContentPanelMap.put(14, new PhoenixLifeSetUpContentPage15(width, height));
		indexWiseContentPanelMap.put(15, new PhoenixLifeSetUpContentPage16(width, height));
		indexWiseContentPanelMap.put(16, new PhoenixLifeSetUpContentPage17(width, height));
	}

}
