package com.cognizant.learn.component;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5962547264382991685L;
	private BufferedImage image;

    public ImagePanel(BufferedImage image) {
       this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}