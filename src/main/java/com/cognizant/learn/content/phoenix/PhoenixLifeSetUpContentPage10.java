package com.cognizant.learn.content.phoenix;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage10 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		@SuppressWarnings("static-access")
		public PhoenixLifeSetUpContentPage10(int width, int height) {
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
			contentPanel1.setPreferredSize(new Dimension(width, 40));
			contentPanel1.setMaximumSize(new Dimension(width, 40));
			contentPanel1.setMinimumSize(new Dimension(width, 40));
			contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel1 = new JLabel(" Login into -> http://localhost:7001/console. ");
			contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel1.add(contentLabel1);
			this.add(contentPanel1);
			
			JPanel imagePanel = new JPanel();
			imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel imageLabel = new JLabel(GuiUtility.getImageIcon("/phoenix_life_setup/phoenix-img-10.png"));
			imagePanel.add(imageLabel);
			imagePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			
			this.add(imagePanel);
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		}
	}