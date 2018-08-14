package com.cognizant.learn.content.phoenix;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cognizant.learn.component.ClearnFooter;
import com.cognizant.learn.component.ClearnToolbar;
import com.cognizant.learn.component.CommonFunctionalInterface;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class PhoenixLifeVideoFrame extends JFrame implements CommonFunctionalInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603718583487093991L;

	private ClearnToolbar clearnToolbar = null;
	private ClearnFooter clearnFooter = null;
	private static JFileChooser filechooser = new JFileChooser();
	private int widthOfMonitor, heightOfMonitor, fullScreenWidth, fullScreenHeight;
	public static int FULL_SCREEN_WIDTH, FULL_SCREEN_HEIGHT;

	private MediaPlayerFactory mediaPlayerFactory;
	private EmbeddedMediaPlayer mediaPlayer;
	private CommonFunctionalInterface commonFunctionalInterface;

	public PhoenixLifeVideoFrame(CommonFunctionalInterface commonFunctionalInterface) {
		this.commonFunctionalInterface = commonFunctionalInterface;

		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		FULL_SCREEN_WIDTH = gd.getDisplayMode().getWidth();
		FULL_SCREEN_HEIGHT = gd.getDisplayMode().getHeight();

		if (FULL_SCREEN_WIDTH >= 1900) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 75 / 100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 75 / 100;
		} else if (FULL_SCREEN_WIDTH >= 1600) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 80 / 100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 90 / 100;
		} else if (FULL_SCREEN_WIDTH >= 1400) {
			widthOfMonitor = FULL_SCREEN_WIDTH * 85 / 100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 90 / 100;
		} else {
			widthOfMonitor = FULL_SCREEN_WIDTH * 90 / 100;
			heightOfMonitor = FULL_SCREEN_HEIGHT * 95 / 100;
		}

		fullScreenWidth = widthOfMonitor;
		fullScreenHeight = heightOfMonitor;

		clearnToolbar = new ClearnToolbar(this, fullScreenWidth);
		clearnToolbar.setBackground(ViewDetails.CLEARN_FOOTER_COLOR_TWO);
		clearnToolbar.setPreferredSize(new Dimension(widthOfMonitor, 78));
		clearnToolbar.setMaximumSize(new Dimension(widthOfMonitor, 78));
		clearnToolbar.setMinimumSize(new Dimension(widthOfMonitor, 78));

		this.getContentPane().add(clearnToolbar);

		clearnFooter = new ClearnFooter(fullScreenWidth);
		clearnFooter.setPreferredSize(new Dimension(widthOfMonitor, 50));
		clearnFooter.setMaximumSize(new Dimension(widthOfMonitor, 50));
		clearnFooter.setMinimumSize(new Dimension(widthOfMonitor, 50));

		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "EMBEDDED_VLC");
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);

		Canvas videoCanvas = new Canvas();
		videoCanvas.setPreferredSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));
		videoCanvas.setMaximumSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));
		videoCanvas.setMinimumSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));
		videoCanvas.setBackground(Color.black);

		JPanel videoCanvasHolderPanel = new JPanel();
		videoCanvasHolderPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		videoCanvasHolderPanel.setLayout(new BorderLayout());
		videoCanvasHolderPanel.add(videoCanvas, BorderLayout.CENTER);
		videoCanvasHolderPanel.setPreferredSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));
		videoCanvasHolderPanel.setMaximumSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));
		videoCanvasHolderPanel.setMinimumSize(new Dimension(widthOfMonitor, fullScreenHeight - 180));

		this.getContentPane().add(videoCanvasHolderPanel);

		JPanel lowerButtonPanel = new JPanel();
		lowerButtonPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		lowerButtonPanel.setPreferredSize(new Dimension(widthOfMonitor, 50));
		lowerButtonPanel.setMaximumSize(new Dimension(widthOfMonitor, 50));
		lowerButtonPanel.setMinimumSize(new Dimension(widthOfMonitor, 50));

		final JButton playbutton = new JButton(GuiUtility.getImageIcon("/images/play.png"));
		playbutton.setBorder(null);
		playbutton.setFocusPainted(false);
		playbutton.setContentAreaFilled(false);
		playbutton.setEnabled(false);
		
		lowerButtonPanel.add(playbutton);

		final JButton pausebutton = new JButton(GuiUtility.getImageIcon("/images/pause.png"));
		pausebutton.setBorder(null);
		pausebutton.setFocusPainted(false);
		pausebutton.setContentAreaFilled(false);
		
		lowerButtonPanel.add(pausebutton);
		
		playbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mediaPlayer.play();
				playbutton.setEnabled(false);
				pausebutton.setEnabled(true);
			}
		});
		
		pausebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mediaPlayer.pause();
				// or mediaPlayer.pause() depending on what works.
				final long time = mediaPlayer.getTime();
				System.out.println(time);
				playbutton.setEnabled(true);
				pausebutton.setEnabled(false);
			}
		});
		
		
		JButton backbutton = new JButton(GuiUtility.getImageIcon("/images/back.png"));
		backbutton.setBorder(null);
		backbutton.setFocusPainted(false);
		backbutton.setContentAreaFilled(false);
		
		backbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				windowClose();
			}
		});
		
		lowerButtonPanel.add(backbutton);

		this.getContentPane().add(lowerButtonPanel);
		this.getContentPane().add(clearnFooter);

		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.showSaveDialog(null);
		File ourfile = filechooser.getSelectedFile();
		String mediaPath = ourfile.getAbsolutePath();

		mediaPlayerFactory = new MediaPlayerFactory();
		mediaPlayer = mediaPlayerFactory.newEmbeddedMediaPlayer();
		mediaPlayer.setVideoSurface(mediaPlayerFactory.newVideoSurface(videoCanvas));

		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setPreferredSize(new Dimension(fullScreenWidth, fullScreenHeight));
		this.setMaximumSize(new Dimension(fullScreenWidth, fullScreenHeight));
		this.setMinimumSize(new Dimension(fullScreenWidth, fullScreenHeight));
		this.setIconImage(GuiUtility.getImage("/images/application_logo.jpg"));
		this.addWindowListener(new WindowListener() {
			public void windowActivated(WindowEvent e) {
			}

			public void windowClosed(WindowEvent e) {
			}

			public void windowClosing(WindowEvent e) {
				// windowClosingAction();
			}

			public void windowDeactivated(WindowEvent e) {
			}

			public void windowDeiconified(WindowEvent e) {
			}

			public void windowIconified(WindowEvent e) {
			}

			public void windowOpened(WindowEvent e) {
			}

		});
		this.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		this.setUndecorated(true);
		this.pack();
		this.setResizable(false);
		this.setLocationByPlatform(true);
		this.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		mediaPlayer.playMedia(mediaPath);
	}

	@Override
	public void windowClose() {
		this.dispose();
		mediaPlayer.release();
		commonFunctionalInterface.changeVisibility(true);
	}

	@Override
	public void changeVisibility(boolean isVisible) {}

}
