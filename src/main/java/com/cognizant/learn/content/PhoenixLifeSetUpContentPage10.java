package com.cognizant.learn.content;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage10 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		@SuppressWarnings("static-access")
		public PhoenixLifeSetUpContentPage10(int width, int height) {
			
			JPanel headerPanel = new JPanel();
//			headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
			headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
			headerPanel.setPreferredSize(new Dimension(width, 50));
			headerPanel.setMaximumSize(new Dimension(width, 50));
			headerPanel.setMinimumSize(new Dimension(width, 50));

			headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel headerLabel = new JLabel(" Login into -> http://localhost:7001/console. ");
			headerLabel.setFont(ViewDetails.CLEARNF25B);
			headerPanel.add(headerLabel);
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			this.add(headerPanel);
			
			
			JPanel imagePanel = new JPanel();
			imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel imageLabel = new JLabel(GuiUtility.getImageIcon("/phoenix_life_setup/phoenix-img-10.png"));
			imagePanel.add(imageLabel);
			imagePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			
			this.add(imagePanel);
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		}
	}