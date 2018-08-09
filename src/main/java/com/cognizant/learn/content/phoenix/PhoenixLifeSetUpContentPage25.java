package com.cognizant.learn.content.phoenix;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage25 extends JPanel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 7530935640169714112L;

		public PhoenixLifeSetUpContentPage25(int width, int height) {
			
			JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel1 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label24);
			contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel1.add(contentLabel1);
			this.add(contentPanel1);
			
			JPanel contentPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel2.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label25);
			contentLabel2.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel2.add(contentLabel2);
			this.add(contentPanel2);
			
			JPanel contentPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel3.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel3 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label26);
			contentLabel3.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel3.add(contentLabel3);
			this.add(contentPanel3);
			
			JPanel contentPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel4.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel4 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label27);
			contentLabel4.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel4.add(contentLabel4);
			this.add(contentPanel4);
			
			JPanel contentPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel5.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel5 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label28);
			contentLabel5.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel5.add(contentLabel5);
			this.add(contentPanel5);
			
			JPanel contentPanel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel6.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel6 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label29);
			contentLabel6.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel6.add(contentLabel6);
			this.add(contentPanel6);
			
			JPanel contentPanel7 = new JPanel();
			contentPanel7.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JTextArea contentLabel7 = new JTextArea(ViewDetails.PHOEINX_LIFE_CONTENT_Label30);
			contentLabel7.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			contentLabel7.setEditable(false);
			contentLabel7.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			contentLabel7.setPreferredSize(new Dimension(width - 100, 150));
			contentLabel7.setMaximumSize(new Dimension(width - 100, 150));
			contentLabel7.setMinimumSize(new Dimension(width - 100, 150));
			contentLabel7.setLineWrap(true);
			contentLabel7.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel7.add(contentLabel7);
			this.add(contentPanel7);
			
			JPanel contentPanel8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel8.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel8 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label31);
			contentLabel8.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
			contentPanel8.add(contentLabel8);
			this.add(contentPanel8);
			
			JPanel contentPanel9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			contentPanel9.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
			JLabel contentLabel9 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label32);
			contentLabel9.setFont(ViewDetails.CLEARNF15);
			contentLabel9.setForeground(Color.blue);
			contentPanel9.add(contentLabel9);
			this.add(contentPanel9);
			
			this.setPreferredSize(new Dimension(width, height));
			this.setMaximumSize(new Dimension(width, height));
			this.setMinimumSize(new Dimension(width, height));
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		}
	}