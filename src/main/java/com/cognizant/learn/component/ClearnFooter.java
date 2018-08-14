package com.cognizant.learn.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class ClearnFooter extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -738027333997395787L;
	@SuppressWarnings("unused")
	private int fullScreenWidth;
	public ClearnFooter(int fullScreenWidth) {

		this.fullScreenWidth = fullScreenWidth;
		intGuiComponent();
	}

	private BufferedImage image = GuiUtility.getBufferedImage("/images/theme.png");

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(image != null){
			g.drawImage(image, 0, 0, this);
		}
	}

	private void intGuiComponent() {


		this.setPreferredSize(new Dimension(fullScreenWidth, 50));
		this.setMinimumSize(new Dimension(fullScreenWidth, 50));
		this.setBackground(ViewDetails.CLEARN_FOOTER_COLOR_TWO);
		this.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 100;
		gbc.weighty = 100;
		gbc.insets = new Insets(0, 15, 0, 15);
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.LINE_AXIS));
		content.setOpaque(false);

		int productlabelwidth=(fullScreenWidth * 50)/100 ;

		JLabel productNameLabel = new JLabel(" @ Cognizant Technology Solution");
		productNameLabel.setForeground(ViewDetails.CLEARN_CONTENT_COLOR);
		productNameLabel.setFont(ViewDetails.CLEARNF18);
		productNameLabel.setPreferredSize(new Dimension(productlabelwidth, 50));
		productNameLabel.setMinimumSize(new Dimension(productlabelwidth, 50));
		productNameLabel.setMaximumSize(new Dimension(productlabelwidth, 50));

		//		productNameLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));

		this.add(productNameLabel, gbc);
		gbc.gridx++;
		this.add(content, gbc);

	}

}
