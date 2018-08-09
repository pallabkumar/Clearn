package com.cognizant.learn.view;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.cognizant.learn.component.ClearnFooter;
import com.cognizant.learn.component.ClearnMiddlePanel;
import com.cognizant.learn.component.ClearnToolbar;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;



public class CLearnClient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7933666428725175417L;
	
	private final static Logger LOG = Logger.getLogger(CLearnClient.class);
	
	private ClearnToolbar clearnToolbar = null;
	private ClearnFooter clearnFooter = null;
	private JPanel clearMiddlePanel;
	private int widthOfMonitor, heightOfMonitor, fullScreenWidth,fullScreenHeight;
	private JPanel mainPanel ;
	public static int FULL_SCREEN_WIDTH, FULL_SCREEN_HEIGHT;

	public CLearnClient() {
		
		new SplashScreen();

		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		FULL_SCREEN_WIDTH = gd.getDisplayMode().getWidth();
		FULL_SCREEN_HEIGHT = gd.getDisplayMode().getHeight();
		
		if(FULL_SCREEN_WIDTH >= 1900) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 75/100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 75/100;
		} else if(FULL_SCREEN_WIDTH >= 1600) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 80/100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 90/100;
		} else if(FULL_SCREEN_WIDTH >= 1400) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 85/100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 90/100;
		} else {
			widthOfMonitor = FULL_SCREEN_WIDTH * 90/100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 95/100;
		}
		
		fullScreenWidth = widthOfMonitor;
		fullScreenHeight = heightOfMonitor;

		clearnToolbar = new ClearnToolbar(this, fullScreenWidth);
		clearnToolbar.setBackground(ViewDetails.CLEARN_FOOTER_COLOR_TWO);
		clearnToolbar.setPreferredSize(new Dimension(widthOfMonitor, 78));
		clearnToolbar.setMaximumSize(new Dimension(widthOfMonitor, 78));
		clearnToolbar.setMinimumSize(new Dimension(widthOfMonitor, 78));

		clearnFooter = new ClearnFooter(this, fullScreenWidth);
		clearnFooter.setPreferredSize(new Dimension(widthOfMonitor, 50));
		clearnFooter.setMaximumSize(new Dimension(widthOfMonitor, 50));
		clearnFooter.setMinimumSize(new Dimension(widthOfMonitor, 50));

		mainPanel = new JPanel();
		mainPanel.setBackground(ViewDetails.CLEARN_WHITE);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		mainPanel.add(clearnToolbar);

		clearMiddlePanel = new ClearnMiddlePanel(widthOfMonitor, fullScreenHeight - 100);
		clearMiddlePanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);

		mainPanel.add(clearMiddlePanel);
		mainPanel.add(clearnFooter);

		this.getContentPane().add(mainPanel);
		this.setIconImage(GuiUtility.getImage("/images/application_logo.jpg"));
		this.addWindowListener(new WindowListener(){
			public void windowActivated(WindowEvent e) {}
			public void windowClosed(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				windowClosingAction();
			}
			public void windowDeactivated(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {
			}
			public void windowOpened(WindowEvent e) {}

		});
		this.setUndecorated(true);
		this.pack();
		this.setResizable(false);
		this.setLocationByPlatform(true);
		this.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

	public static void main(String args[]) {
		LOG.info(" Initializing the application... ");
		new CLearnClient();
		LOG.info(" Shutting down the application... ");
	}

	public void windowClosingAction() {
		System.exit(0);
	}

}
