package com.cognizant.learn.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class SplashScreen {

	private JFrame frame;
	private JLabel image = new JLabel(GuiUtility.getImageIcon("/images/logo.png"));
	private JLabel text = new JLabel("Cognizant Learn");
	private JProgressBar progressBar = new JProgressBar();
	private JLabel message = new JLabel();

	public SplashScreen() {
		createGUI(); addImage(); addText();
		addProgressBar(); addMessage(); runningProgressBar();
	}

	public void createGUI() {

		frame = new JFrame();
		frame.setIconImage(GuiUtility.getImage("/images/application_logo.jpg"));
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(ViewDetails.CLEARN_FOOTER_COLOR_TWO);
		frame.setVisible(true);
	}

	public void addImage() {
		image.setSize(600,200);
		frame.add(image);
	}

	public void addText() {
		text.setFont(new Font("arial",Font.BOLD,30));
		text.setBounds(170,220,600,40);
		text.setForeground(Color.BLUE);
		frame.add(text);
	}

	public void addMessage() {
		message.setBounds(250,320,200,40);
		message.setForeground(Color.black);
		message.setFont(new Font("arial",Font.BOLD,15));
		frame.add(message);
	}

	public void addProgressBar() {
		progressBar.setBounds(100,280,400,30);
		progressBar.setBorderPainted(true);
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.WHITE);
		progressBar.setForeground(Color.BLACK);
		progressBar.setValue(0);
		frame.add(progressBar);
	}

	public void runningProgressBar() {
		int i = 0;

		while(i <= 100) {
			try {
				Thread.sleep(25);
				progressBar.setValue(i);
				i++;
				if (i == 100) {
					frame.dispose();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
}
