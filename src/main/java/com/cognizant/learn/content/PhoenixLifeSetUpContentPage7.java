package com.cognizant.learn.content;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage7 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		@SuppressWarnings("static-access")
		public PhoenixLifeSetUpContentPage7(int width, int height) {
			
			JPanel headerPanel = new JPanel();
//			headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
			headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
			headerPanel.setPreferredSize(new Dimension(width, 50));
			headerPanel.setMaximumSize(new Dimension(width, 50));
			headerPanel.setMinimumSize(new Dimension(width, 50));

			headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel headerLabel = new JLabel(" Inside the local_artifacts folder ear and war files will be created. ");
			headerLabel.setFont(ViewDetails.CLEARNF25B);
			headerPanel.add(headerLabel);
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			this.add(headerPanel);
			
			JPanel contentPanel = new JPanel();
//			contentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			contentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			contentPanel.setPreferredSize(new Dimension(width, 100));
			contentPanel.setMaximumSize(new Dimension(width, 100));
			contentPanel.setMinimumSize(new Dimension(width, 100));

			contentPanel.setLayout(new GridBagLayout());
//			contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			
			JLabel contentLabel1 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label4);
			contentLabel1.setFont(ViewDetails.CLEARNF20);
			contentPanel.add(contentLabel1, gbc);
			
			gbc.gridy++;
			
			JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label5);
			contentLabel2.setFont(ViewDetails.CLEARNF20);
			contentPanel.add(contentLabel2, gbc);
			
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