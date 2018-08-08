package com.cognizant.learn.component;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.IntroductionContentPanel;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.ViewDetails;
import com.cognizant.learn.view.CLearnClient;

public class ClearnMiddlePanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2259007765437794654L;
	
	public static int CONTENT_ID = ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID; 
	
	
	private JPanel leftSideTableOfContentScrollPanel;
	private JScrollPane leftSideTableOfContentScrollPane;
	private int contextMenuFixedHeight = 40;
	private int width, height;
	private IntroductionContentPanel introductionContentPanel;
	private PhoenixLifeSetUpContentPanel phoenixLifeSetUpContentPanel;
	
	public IntroductionContentPanel getIntroductionContentPanel() {
		return introductionContentPanel;
	}

	public PhoenixLifeSetUpContentPanel getPhoenixLifeSetUpContentPanel() {
		return phoenixLifeSetUpContentPanel;
	}

	private JPanel rightSideTableOfContentPanel;
	
	public ClearnMiddlePanel(int width, int height) {
		
		this.width = width;
		this.height = height;

		leftSideTableOfContentScrollPanel = new JPanel();
		
		leftSideTableOfContentScrollPanel.setPreferredSize(new Dimension(width * 23/100, height - 10));
		leftSideTableOfContentScrollPanel.setMaximumSize(new Dimension(width * 23/100, height - 10));
		leftSideTableOfContentScrollPanel.setMinimumSize(new Dimension(width * 23/100, height - 10));
		
		leftSideTableOfContentScrollPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		leftSideTableOfContentScrollPanel.setLayout(new BoxLayout(leftSideTableOfContentScrollPanel, BoxLayout.Y_AXIS));
		
		populateOtherContentMenus();
		
	    leftSideTableOfContentScrollPane = new JScrollPane(leftSideTableOfContentScrollPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    leftSideTableOfContentScrollPane.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
	    leftSideTableOfContentScrollPane.setBorder(BorderFactory.createLineBorder(ViewDetails.CLEARN_CONTENT_HEADER_COLOR));
	    leftSideTableOfContentScrollPane.setPreferredSize(new Dimension(width * 25/100, height));
	    leftSideTableOfContentScrollPane.setMaximumSize(new Dimension(width * 25/100, height));
	    leftSideTableOfContentScrollPane.setMinimumSize(new Dimension(width * 25/100, height));

	    leftSideTableOfContentScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {}
		});
		
	    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	    this.add(leftSideTableOfContentScrollPane);
	    
	    rightSideTableOfContentPanel = new JPanel();
//	    rightSideTableOfContentPanel.setBorder(BorderFactory.createLineBorder(Color.red));
	    rightSideTableOfContentPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
	    rightSideTableOfContentPanel.setPreferredSize(new Dimension(width * 75/100, height));
	    rightSideTableOfContentPanel.setMaximumSize(new Dimension(width * 75/100, height));
	    rightSideTableOfContentPanel.setMinimumSize(new Dimension(width * 75/100, height));
	    
	    populateContent();
	    
	    this.add(rightSideTableOfContentPanel);

	    this.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		
	}

	private void populateContent() {
		
		rightSideTableOfContentPanel.removeAll();
		rightSideTableOfContentPanel.repaint();
		rightSideTableOfContentPanel.validate();
		
		int contentPanelWidth = width * 70/100;
		int contentPanelheight = height * 80/100;
		
		if(CLearnClient.FULL_SCREEN_WIDTH >= 1600) {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1400) {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		} else {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		}
		
		if (CONTENT_ID == ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID) {
			introductionContentPanel = new IntroductionContentPanel(contentPanelWidth, contentPanelheight);
			rightSideTableOfContentPanel.add(introductionContentPanel);
		} else if (CONTENT_ID == ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_ID) {
			phoenixLifeSetUpContentPanel = new PhoenixLifeSetUpContentPanel(contentPanelWidth, contentPanelheight);
			rightSideTableOfContentPanel.add(phoenixLifeSetUpContentPanel);
		}
		
		ClearnRightLowerButtonPanel clearnRightLowerButtonPanel = new ClearnRightLowerButtonPanel(this, contentPanelWidth, height * 10/100);
		rightSideTableOfContentPanel.add(clearnRightLowerButtonPanel);
		
		rightSideTableOfContentPanel.repaint();
		rightSideTableOfContentPanel.validate();
	}

	private void populateOtherContentMenus() {
		
		leftSideTableOfContentScrollPanel.removeAll();
		leftSideTableOfContentScrollPanel.repaint();
		leftSideTableOfContentScrollPanel.validate();
		
		JPanel tableOfContentHeaderPanel = new JPanel();
		tableOfContentHeaderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tableOfContentHeaderPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		tableOfContentHeaderPanel.setPreferredSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMaximumSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMinimumSize(new Dimension(width * 23/100, 60));

		// header label
		JLabel headerLabel = new JLabel("Table of Contents");
		headerLabel.setFont(ViewDetails.CLEARNF25B);
		tableOfContentHeaderPanel.add(headerLabel);
		leftSideTableOfContentScrollPanel.add(tableOfContentHeaderPanel);

		for (Entry<Integer, String> contentMenuMap : ContentMenuWiseContentPanelMapper.contentMenuWiseContentPanelMap.entrySet()) {
			final JPanel contentMenuPanel = new JPanel();
			contentMenuPanel.setName(contentMenuMap.getValue());
			contentMenuPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
			contentMenuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			contentMenuPanel.setPreferredSize(new Dimension(width * 23/100, contextMenuFixedHeight));
			contentMenuPanel.setMaximumSize(new Dimension(width * 23/100, contextMenuFixedHeight));
			contentMenuPanel.setMinimumSize(new Dimension(width * 23/100, contextMenuFixedHeight));
			
			final JLabel introLabel = new JLabel(ContentMenuWiseContentPanelMapper.CONTENT_MENU_TEXT[contentMenuMap.getKey()]);
			
			if (CONTENT_ID == contentMenuMap.getKey()) {
				introLabel.setForeground(ViewDetails.CLEARN_GREEN);
			} else {
				introLabel.setForeground(ViewDetails.CLEARN_BLACK);
			}
			
			introLabel.addMouseListener(new MouseListener() {
				public void mouseReleased(MouseEvent e) {}
				
				public void mousePressed(MouseEvent e) {}
				
				public void mouseExited(MouseEvent e) {}
				
				public void mouseEntered(MouseEvent e) {}
				
				public void mouseClicked(MouseEvent e) {
					for (Entry<String, Integer> contentIdMap : ContentMenuWiseContentPanelMapper.contentPanelWiseContentMenuMap.entrySet()) {
						if (contentMenuPanel.getName().equals(contentIdMap.getKey())) {
							CONTENT_ID = contentIdMap.getValue();
							populateContent();
							populateOtherContentMenus();
						}
					}
				}
			});
			
			introLabel.setFont(ViewDetails.CLEARNF18B);
			contentMenuPanel.add(introLabel);
			leftSideTableOfContentScrollPanel.add(contentMenuPanel);
			leftSideTableOfContentScrollPanel.repaint();
			leftSideTableOfContentScrollPanel.validate();
		}
		
	}

}
