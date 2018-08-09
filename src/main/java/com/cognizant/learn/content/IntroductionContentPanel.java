package com.cognizant.learn.content;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.cognizant.learn.utilities.ViewDetails;

public class IntroductionContentPanel extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5892852024963411903L;
	
	public static final int MAX_CONTENT_PAGE_COUNT = 1;
	private int contentIndex = 1;
	
	public int getContentIndex() {
		return contentIndex;
	}

	public void setContentIndex(int contentIndex) {
		this.contentIndex = contentIndex;
	}

	public IntroductionContentPanel (int width, int height) {

		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
		headerPanel.setPreferredSize(new Dimension(width, 50));
		headerPanel.setMaximumSize(new Dimension(width, 50));
		headerPanel.setMinimumSize(new Dimension(width, 50));

		headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel headerLabel = new JLabel(" Introduction ");
		headerLabel.setFont(ViewDetails.CLEARNF25B);
		headerPanel.add(headerLabel);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(headerPanel);
		
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		contentPanel.setPreferredSize(new Dimension(width, height - 50));
		contentPanel.setMaximumSize(new Dimension(width, height - 50));
		contentPanel.setMinimumSize(new Dimension(width, height - 50));
		
		JTextArea contenLabel = new JTextArea(ViewDetails.INTRO_STR);
		contenLabel.setEditable(false);
		contenLabel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		contenLabel.setPreferredSize(new Dimension(width - 20, height - 50));
		contenLabel.setMaximumSize(new Dimension(width - 20, height - 50));
		contenLabel.setMinimumSize(new Dimension(width - 20, height - 50));
		contenLabel.setLineWrap(true);
		contenLabel.setFont(ViewDetails.CLEARNF20);
		contentPanel.add(contenLabel);
		
		this.add(contentPanel);
		
		this.setName(ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_PANEL_NAME);
		this.setBorder(BorderFactory.createLineBorder(ViewDetails.CLEARN_CONTENT_HEADER_COLOR));
		this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
	}

}
