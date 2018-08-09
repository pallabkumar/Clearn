package com.cognizant.learn.content.phoenix;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage1 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		public PhoenixLifeSetUpContentPage1(int width, int height) {
			
			JPanel headerPanel = new JPanel();
//			headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
			headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
			headerPanel.setPreferredSize(new Dimension(width, 40));
			headerPanel.setMaximumSize(new Dimension(width, 40));
			headerPanel.setMinimumSize(new Dimension(width, 40));

			headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

			JLabel headerLabel = new JLabel(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SUB_MENU_1);
			headerLabel.setFont(PhoenixLifeSetUpContentPanel.HEADER_FONT);
			headerPanel.add(headerLabel);
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			this.add(headerPanel);
			
			JPanel contentPanel = new JPanel();
//			contentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			contentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			contentPanel.setPreferredSize(new Dimension(width, 120));
			contentPanel.setMaximumSize(new Dimension(width, 120));
			contentPanel.setMinimumSize(new Dimension(width, 120));

			contentPanel.setLayout(new GridBagLayout());
//			contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			
			JLabel contentLabel1 = new JLabel(" Download the codebase from GIT repository ");
			contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel1, gbc);
			
			gbc.gridy++;
			
			JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label1);
			contentLabel2.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel2, gbc);
			
			gbc.gridy++;
			
			JLabel contentLabel3 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label2);
			contentLabel3.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel3, gbc);
			
			gbc.gridy++;
			
			JLabel contentLabel4 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label3);
			contentLabel4.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel.add(contentLabel4, gbc);
			
			this.add(contentPanel);
			
			JPanel imagePanel = new JPanel();
			imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel imageLabel = new JLabel(GuiUtility.getImageIcon("/phoenix_life_setup/phoenix-img-01.png"));
			imagePanel.add(imageLabel);
			imagePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			
			this.add(imagePanel);
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			
		}
	}