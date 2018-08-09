package com.cognizant.learn.component;

import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;
import com.cognizant.learn.view.CLearnClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearnToolbar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7824332186102221655L;
	private static CLearnClient clearnClient = null;

	@SuppressWarnings("unused")
	private int fullScreenWidth = -1;

	@SuppressWarnings("static-access")
	public ClearnToolbar(CLearnClient clearnClient, int fullScreenWidth) {
		this.clearnClient = clearnClient;
		this.fullScreenWidth = fullScreenWidth;

		JPanel decoration = new JPanel(true);
		decoration.setPreferredSize(new Dimension(fullScreenWidth, 75));
		decoration.setMaximumSize(new Dimension(fullScreenWidth, 75));
		decoration.setMinimumSize(new Dimension(fullScreenWidth, 75));
		
//		decoration.setBorder(BorderFactory.createLineBorder(Color.black));
		decoration.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(2,2,2,2);
		decoration.setOpaque(false);

		JPanel headingLogoPanel = new JPanel();
		headingLogoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		int logoPanelWidth = fullScreenWidth * 25/100;
		int midPanelWidth = fullScreenWidth * 70/100;
		
		if(CLearnClient.FULL_SCREEN_WIDTH >=1900) {
			logoPanelWidth = fullScreenWidth * 25/100;
			midPanelWidth = fullScreenWidth * 70/100;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1600) {
			logoPanelWidth = fullScreenWidth * 30/100;
			midPanelWidth = fullScreenWidth * 65/100;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1400) {
			logoPanelWidth = fullScreenWidth * 30/100;
			midPanelWidth = fullScreenWidth * 65/100;
		} else {
			logoPanelWidth = fullScreenWidth * 30/100;
			midPanelWidth = fullScreenWidth * 65/100;
		}
		
		headingLogoPanel.setPreferredSize(new Dimension(logoPanelWidth, 75));
		headingLogoPanel.setMaximumSize(new Dimension(logoPanelWidth, 75));
		headingLogoPanel.setMinimumSize(new Dimension(logoPanelWidth, 75));
//		headingLogoPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		headingLogoPanel.setOpaque(false);
		
		JLabel logo = new JLabel(GuiUtility.getImageIcon("/images/logo.png"));
		headingLogoPanel.add(logo);

		decoration.add(headingLogoPanel, gbc);
		gbc.gridx ++;

		JPanel middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(midPanelWidth, 75));
		middlePanel.setMaximumSize(new Dimension(midPanelWidth, 75));
		middlePanel.setMinimumSize(new Dimension(midPanelWidth, 75));
//		middlePanel.setBorder(BorderFactory.createLineBorder(Color.blue));
		middlePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcMiddle = new GridBagConstraints();
		gbcMiddle.gridx = 0;
		gbcMiddle.gridy = 0;
		gbcMiddle.insets = new Insets(2,2,2,200);
		
		middlePanel.setOpaque(false);

		JLabel headingLabel = new JLabel("Cognizant Learning Board");
		headingLabel.setFont(ViewDetails.CLEARNF25B);
		headingLabel.setForeground(ViewDetails.CLEARN_BLACK);
		middlePanel.add(headingLabel, gbcMiddle);

		decoration.add(middlePanel, gbc);
		gbc.gridx ++;
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(ViewDetails.CLEARN_FOOTER_COLOR_TWO);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setPreferredSize(new Dimension(fullScreenWidth * 5/100, 40));
		buttonPanel.setMaximumSize(new Dimension(fullScreenWidth * 5/100, 40));
		buttonPanel.setMinimumSize(new Dimension(fullScreenWidth * 5/100, 40));
//		middlePanel.setBorder(BorderFactory.createLineBorder(Color.blue));

		JButton close = new JButton(GuiUtility.getImageIcon("/images/close.png"));
		close.setRolloverIcon(GuiUtility.getImageIcon("/images/close_over.png"));
		close.setBorder(null);
		close.setFocusPainted(false);
		close.setContentAreaFilled(false);
		close.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				closeAction();

			}
		});
		
		buttonPanel.add(close);
		
		decoration.add(buttonPanel, gbc);

		this.setBackground(ViewDetails.CLEARN_TOOLBAR_BACKGROUND);
		this.setLayout(new GridBagLayout());
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(2,2,5,2);
		this.add(decoration, gbc);
	}
	
	protected void closeAction() {
		clearnClient.windowClosingAction();
	}

	public static void main(String[] args) {}
}
