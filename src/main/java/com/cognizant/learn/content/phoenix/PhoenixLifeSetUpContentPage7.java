package com.cognizant.learn.content.phoenix;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage7 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		@SuppressWarnings("static-access")
		public PhoenixLifeSetUpContentPage7(int width, int height) {
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
			contentPanel1.setPreferredSize(new Dimension(width, 40));
			contentPanel1.setMaximumSize(new Dimension(width, 40));
			contentPanel1.setMinimumSize(new Dimension(width, 40));
			contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel1 = new JLabel(" Inside the local_artifacts folder ear and war files will be created. ");
			contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel1.add(contentLabel1);
			this.add(contentPanel1);
			
			JPanel contentPanel = new JPanel();
//			contentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			contentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			contentPanel.setPreferredSize(new Dimension(width, 60));
			contentPanel.setMaximumSize(new Dimension(width, 60));
			contentPanel.setMinimumSize(new Dimension(width, 60));

			contentPanel.setLayout(new GridBagLayout());
//			contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			
			JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label4);
			contentLabel2.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel2, gbc);
			
			gbc.gridy++;
			
			JLabel contentLabel3 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label5);
			contentLabel3.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel3, gbc);
			
			this.add(contentPanel);
			
			JPanel imagePanel = new JPanel();
			imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel imageLabel = new JLabel(GuiUtility.getImageIcon("/phoenix_life_setup/phoenix-img-07.png"));
			imagePanel.add(imageLabel);
			imagePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			
			this.add(imagePanel);
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		}
	}