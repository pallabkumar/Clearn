package com.cognizant.learn.content.phoenix;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class PhoenixLifeSetUpContentPage11 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7530935640169714112L;

	@SuppressWarnings("static-access")
	public PhoenixLifeSetUpContentPage11(int width, int height) {

		JPanel headerPanel = new JPanel();
		//			headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
		headerPanel.setPreferredSize(new Dimension(width, 40));
		headerPanel.setMaximumSize(new Dimension(width, 40));
		headerPanel.setMinimumSize(new Dimension(width, 40));

		headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel headerLabel = new JLabel(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SUB_MENU_4);
		headerLabel.setFont(PhoenixLifeSetUpContentPanel.HEADER_FONT);
		headerPanel.add(headerLabel);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(headerPanel);
		
		JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel contentLabel1 = new JLabel(" Deploy all the ears (created in step 6) into weblogic server. ");
		contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel1.add(contentLabel1);
		this.add(contentPanel1);

		JPanel contentPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		contentPanel2.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		
		JLabel contentLabel2 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label6);
		contentLabel2.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel2.add(contentLabel2);

		JLabel contentLabel3 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label7);
		contentLabel3.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel2.add(contentLabel3);
		
		JLabel contentLabel4 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label8);
		contentLabel4.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel2.add(contentLabel4);
		
		JLabel contentLabel5 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label9);
		contentLabel5.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel2.add(contentLabel5);
		
		this.add(contentPanel2);

		JPanel contentPanel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		contentPanel6.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel contentLabel6 = new JLabel(ViewDetails.PHOEINX_LIFE_CONTENT_Label10);
		contentLabel6.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel6.add(contentLabel6);
		
		this.add(contentPanel6);


		JPanel imagePanel = new JPanel();
		imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel imageLabel = new JLabel(GuiUtility.getImageIcon("/phoenix_life_setup/phoenix-img-11.png"));
		imagePanel.add(imageLabel);
		imagePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);

		this.add(imagePanel);
		this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
	}
}