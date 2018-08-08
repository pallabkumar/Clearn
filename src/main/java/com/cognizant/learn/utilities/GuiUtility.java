package com.cognizant.learn.utilities;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GuiUtility {


	public static ImageIcon getImageIcon(String path) {
		URL url = GuiUtility.class.getResource(path);
		//System.out.println(path + " ..... " + url);
		if (url != null)
			return (new ImageIcon(url));
		else
			System.err.println("Unable to load ImageIcon " + path);
		return null;
	}

	public static Image getImage(String path) {
		URL url = GuiUtility.class.getResource(path);
		//System.out.println(path + " ..... " + url);
		if (url != null)
			return (new ImageIcon(url)).getImage();
		else
			System.err.println("Unable to load Image  " + path);

		return null;
	}

	public static BufferedImage getBufferedImage(String path) {
		URL url = GuiUtility.class.getResource(path);
		//System.out.println(path + " ..... " + url);
		if (url != null)
		{
			try {
				BufferedImage img = ImageIO.read(url);
				return img;
			} catch (IOException e) {
				System.err.println("Unable to load BufferedImage  " + path + " " + e.toString());
			}
		} else{
			System.err.println("Unable to load BufferedImage  " + path);
		}
		return null;
	}


	public static BufferedImage toBufferedImage(ImageIcon ico) {
		Image img = ico.getImage();

		if (img instanceof BufferedImage)
		{
			return (BufferedImage) img;
		}

		// Create a buffered image with transparency
		BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		// Draw the image on to the buffered image
		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(img, 0, 0, null);
		bGr.dispose();

		// Return the buffered image
		return bimage;
	}

}
