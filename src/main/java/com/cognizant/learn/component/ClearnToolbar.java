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

	private Box boxAfterClose;
	@SuppressWarnings("unused")
	private int fullScreenWidth = -1;

	@SuppressWarnings("static-access")
	public ClearnToolbar(CLearnClient clearnClient, int fullScreenWidth) {
		this.clearnClient = clearnClient;
		this.fullScreenWidth = fullScreenWidth;

		JPanel decoration = new JPanel(true);
		decoration.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(2,2,2,2);
		decoration.setOpaque(false);

		JPanel headingLogoPanel=new JPanel();
		headingLogoPanel.setLayout(new GridBagLayout());


		GridBagConstraints gbcHeading = new GridBagConstraints();
		gbcHeading.gridx = 0;
		gbcHeading.gridy = 0;
		gbcHeading.insets = new Insets(2,5,2,2);


		headingLogoPanel.setOpaque(false);
		
		JLabel logo=new JLabel(GuiUtility.getImageIcon("/images/logo.png"));
		headingLogoPanel.add(logo, gbcHeading);

		decoration.add(headingLogoPanel, gbc);
		gbc.gridx ++;

		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcMiddle = new GridBagConstraints();
		gbcMiddle.gridx = 0;
		gbcMiddle.gridy = 0;
		gbcMiddle.insets = new Insets(2,2,2,200);
		
		middlePanel.setOpaque(false);
		int middlePanelW = fullScreenWidth - headingLogoPanel.getWidth() - 280;

		middlePanel.setPreferredSize(new Dimension(middlePanelW, 30));
		middlePanel.setMinimumSize(new Dimension(middlePanelW, 30));

		JLabel headingLabel = new JLabel("Cognizant Learning Board");
		headingLabel.setFont(new Font("Calibri", Font.PLAIN, 25));
		headingLabel.setForeground(ViewDetails.CLEARN_BLACK);
		middlePanel.add(headingLabel, gbcMiddle);

		decoration.add(middlePanel, gbc);
		gbc.gridx ++;

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
		decoration.add(close, gbc);


		boxAfterClose = Box.createHorizontalBox();
		boxAfterClose.setPreferredSize(new Dimension(15, 1));
		boxAfterClose.setMinimumSize(new Dimension(15, 1));
		decoration.add(boxAfterClose);
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
