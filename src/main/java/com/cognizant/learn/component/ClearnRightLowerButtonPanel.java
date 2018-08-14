package com.cognizant.learn.component;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.IntroductionContentPanel;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class ClearnRightLowerButtonPanel extends JPanel implements InterPanelCommInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4397313038171274178L;

	private ClearnMiddlePanel clearnMiddlePanel;
	private final JButton nextButton = new JButton(GuiUtility.getImageIcon("/images/forward_arrow.png"));
	private final JButton prevButton = new JButton(GuiUtility.getImageIcon("/images/back_arrow.png"));

	public ClearnRightLowerButtonPanel(final ClearnMiddlePanel clearnMiddlePanel, int width, int height) {

		this.clearnMiddlePanel = clearnMiddlePanel; 

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		checkingAboutContentPageCount();

		JPanel prevButtonPanel = new JPanel();
		prevButtonPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		prevButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		prevButtonPanel.setPreferredSize(new Dimension(width * 50/100, height));
		prevButtonPanel.setMaximumSize(new Dimension(width * 50/100, height));
		prevButtonPanel.setMinimumSize(new Dimension(width * 50/100, height));

		prevButton.setBorder(null);
		prevButton.setFocusPainted(false);
		prevButton.setContentAreaFilled(false);
		prevButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_ID) {
					PhoenixLifeSetUpContentPanel phoenixLifeSetUpContentPanel = clearnMiddlePanel.getPhoenixLifeSetUpContentPanel();
					int contentIndex = phoenixLifeSetUpContentPanel.getContentIndex();
					phoenixLifeSetUpContentPanel.setContentIndex(--contentIndex);
					phoenixLifeSetUpContentPanel.populatePhoenixLifeContentPanel();

					nextButton.setEnabled(true);

					if (contentIndex == PhoenixLifeSetUpContentPanel.MAX_CONTENT_PAGE_COUNT) {
						prevButton.setEnabled(false);
					} else {
						prevButton.setEnabled(true);
					}

				} else if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID) {
					IntroductionContentPanel introductionContentPanel = clearnMiddlePanel.getIntroductionContentPanel();
					int contentIndex = introductionContentPanel.getContentIndex();

					nextButton.setEnabled(true);

					if (contentIndex == IntroductionContentPanel.MAX_CONTENT_PAGE_COUNT) {
						prevButton.setEnabled(false);
					} else {
						prevButton.setEnabled(true);
					}
				}
			}
		});

		prevButtonPanel.add(prevButton);
		this.add(prevButtonPanel);

		JPanel nextButtonPanel = new JPanel();
		nextButtonPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		nextButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		nextButtonPanel.setPreferredSize(new Dimension(width * 50/100, height));
		nextButtonPanel.setMaximumSize(new Dimension(width * 50/100, height));
		nextButtonPanel.setMinimumSize(new Dimension(width * 50/100, height));

		nextButton.setBorder(null);
		nextButton.setFocusPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_ID) {
					PhoenixLifeSetUpContentPanel phoenixLifeSetUpContentPanel = clearnMiddlePanel.getPhoenixLifeSetUpContentPanel();
					int contentIndex = phoenixLifeSetUpContentPanel.getContentIndex();
					phoenixLifeSetUpContentPanel.setContentIndex(++contentIndex);
					phoenixLifeSetUpContentPanel.populatePhoenixLifeContentPanel();

					prevButton.setEnabled(true);

					if (contentIndex == PhoenixLifeSetUpContentPanel.MAX_CONTENT_PAGE_COUNT) {
						nextButton.setEnabled(false);
					} else {
						nextButton.setEnabled(true);
					}

				} else if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID) {

					IntroductionContentPanel introductionContentPanel = clearnMiddlePanel.getIntroductionContentPanel();
					int contentIndex = introductionContentPanel.getContentIndex();

					prevButton.setEnabled(true);

					if (contentIndex == IntroductionContentPanel.MAX_CONTENT_PAGE_COUNT) {
						nextButton.setEnabled(false);
					} else {
						nextButton.setEnabled(true);
					}
				}
			}
		});

		nextButtonPanel.add(nextButton);
		this.add(nextButtonPanel);

		clearnMiddlePanel.setInterPanelCommInterface(this);
		this.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
	}

	private void checkingAboutContentPageCount() {
		if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_ID) {
			PhoenixLifeSetUpContentPanel phoenixLifeSetUpContentPanel = clearnMiddlePanel.getPhoenixLifeSetUpContentPanel();
			int contentIndex = phoenixLifeSetUpContentPanel.getContentIndex();

			if (contentIndex == PhoenixLifeSetUpContentPanel.MAX_CONTENT_PAGE_COUNT) {
				prevButton.setEnabled(false);
				nextButton.setEnabled(false);
			} else {
				prevButton.setEnabled(true);
				nextButton.setEnabled(true);
			}

		} else if (ClearnMiddlePanel.CONTENT_ID == ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID) {
			IntroductionContentPanel introductionContentPanel = clearnMiddlePanel.getIntroductionContentPanel();
			int contentIndex = introductionContentPanel.getContentIndex();

			if (contentIndex == IntroductionContentPanel.MAX_CONTENT_PAGE_COUNT) {
				prevButton.setEnabled(false);
				nextButton.setEnabled(false);
			} else {
				prevButton.setEnabled(true);
				nextButton.setEnabled(true);
			}
		}

	}
	
	@Override
	public void buttonStatusChange() {
		prevButton.setEnabled(true);
		nextButton.setEnabled(true);		
	}
}
