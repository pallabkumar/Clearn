package com.cognizant.learn.content.phoenix;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage20 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		@SuppressWarnings("static-access")
		public PhoenixLifeSetUpContentPage20(int width, int height) {
			
			JPanel headerPanel = new JPanel();
//			headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
			headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
			headerPanel.setPreferredSize(new Dimension(width, 40));
			headerPanel.setMaximumSize(new Dimension(width, 40));
			headerPanel.setMinimumSize(new Dimension(width, 40));
//			headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel headerLabel = new JLabel(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SUB_MENU_6);
			headerLabel.setFont(PhoenixLifeSetUpContentPanel.HEADER_FONT);
			headerPanel.add(headerLabel);
			
//			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
			this.add(headerPanel);
			
			JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel1 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label11);
			contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel1.add(contentLabel1);
			this.add(contentPanel1);
			
			JPanel contentPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel2.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label12);
			contentLabel2.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel2.add(contentLabel2);
			this.add(contentPanel2);
			
			JPanel contentPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel3.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel3 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label13);
			contentLabel3.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel3.add(contentLabel3);
			this.add(contentPanel3);
			
			JPanel contentPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel4.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel4 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label14);
			contentLabel4.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel4.add(contentLabel4);
			this.add(contentPanel4);
			
			JPanel contentPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel5.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel5 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label15);
			contentLabel5.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentLabel5.setForeground(Color.BLUE);
			contentPanel5.add(contentLabel5);
			this.add(contentPanel5);
			
			JPanel contentPanel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel6.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel6 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label16);
			contentLabel6.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel6.add(contentLabel6);
			this.add(contentPanel6);
			
			JPanel contentPanel7 = new JPanel();
			contentPanel7.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JTextArea contentLabel7 = new JTextArea(ViewDetails.PHOEINX_LIFE_CONTENT_Label17);
			contentLabel7.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			contentLabel7.setEditable(false);
			contentLabel7.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			contentLabel7.setPreferredSize(new Dimension(width - 100, 100));
			contentLabel7.setMaximumSize(new Dimension(width - 100, 100));
			contentLabel7.setMinimumSize(new Dimension(width - 100, 100));
			contentLabel7.setLineWrap(true);
			contentLabel7.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel7.add(contentLabel7);
			this.add(contentPanel7);
			
			JPanel contentPanel8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel8.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel8 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label18);
			contentLabel8.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel8.add(contentLabel8);
			this.add(contentPanel8);
			
			JPanel contentPanel9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel9.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel9 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label19);
			contentLabel9.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel9.add(contentLabel9);
			this.add(contentPanel9);
			
			JPanel contentPanel10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel10.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel10 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label20);
			contentLabel10.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel10.add(contentLabel10);
			this.add(contentPanel10);
			
			JPanel contentPanel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel11.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel11 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label21);
			contentLabel11.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel11.add(contentLabel11);
			this.add(contentPanel11);
			
			JPanel contentPanel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel12.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel12 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label22);
			contentLabel12.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel12.add(contentLabel12);
			this.add(contentPanel12);
			
			JPanel contentPanel13 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel13.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel13 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label23);
			contentLabel13.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel13.add(contentLabel13);
			this.add(contentPanel13);
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		}
	}