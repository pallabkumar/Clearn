package com.cognizant.learn.content.phoenix;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;

public class DisscussionFormPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7603718583487093991L;

	private final static Logger LOG = Logger.getLogger(DisscussionFormPage.class);

	private JFileChooser fileChooser = null;

	private File selectedFile;;

	private JTextField firstNameField, lastNameField, emailField;

	private JTextArea commentTextArea;

	@SuppressWarnings("unused")
	public DisscussionFormPage(int width, int height) {

		JPanel headerPanel = new JPanel();
		//		headerPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		headerPanel.setBackground(ViewDetails.CLEARN_CONTENT_HEADER_COLOR);
		headerPanel.setPreferredSize(new Dimension(width, 40));
		headerPanel.setMaximumSize(new Dimension(width, 40));
		headerPanel.setMinimumSize(new Dimension(width, 40));

		headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel headerLabel = new JLabel(ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SUB_MENU_7);
		headerLabel.setFont(PhoenixLifeSetUpContentPanel.HEADER_FONT);
		headerPanel.add(headerLabel);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(headerPanel);

		JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		contentPanel1.setPreferredSize(new Dimension(width, 50));
		contentPanel1.setMaximumSize(new Dimension(width, 50));
		contentPanel1.setMinimumSize(new Dimension(width, 50));
		contentPanel1.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel contentLabel1 = new JLabel(" If you have any suggestion for us, we’d love to hear it - ");
		contentLabel1.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		contentPanel1.add(contentLabel1);
		this.add(contentPanel1);

		JPanel nameLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameLabelPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel nameLabel = new JLabel(" * Full Name");
		nameLabel.setFont(ViewDetails.CLEARNF16B);
		nameLabelPanel.add(nameLabel);
		this.add(nameLabelPanel);

		JPanel fullNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		fullNamePanel.setPreferredSize(new Dimension(width - 25, 50));
		fullNamePanel.setMaximumSize(new Dimension(width - 25, 50));
		fullNamePanel.setMinimumSize(new Dimension(width - 25, 50));
		fullNamePanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);

		firstNameField = new JTextField();
		firstNameField.setPreferredSize(new Dimension(250, 35));
		firstNameField.setFont(ViewDetails.CLEARNF18);
		firstNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		firstNameField.setCaretColor(new java.awt.Color(252, 243, 48));
		firstNameField.setOpaque(false);

		fullNamePanel.add(firstNameField);


		lastNameField = new JTextField();
		lastNameField.setPreferredSize(new Dimension(250, 35));
		lastNameField.setFont(ViewDetails.CLEARNF18);
		lastNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		lastNameField.setCaretColor(new java.awt.Color(252, 243, 48));
		lastNameField.setOpaque(false);

		fullNamePanel.add(lastNameField);

		this.add(fullNamePanel);

		JPanel emailLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		emailLabelPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel emailLabel = new JLabel(" * Email");
		emailLabel.setFont(ViewDetails.CLEARNF16B);
		emailLabelPanel.add(emailLabel);
		this.add(emailLabelPanel);

		JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		emailPanel.setPreferredSize(new Dimension(width - 25, 50));
		emailPanel.setMaximumSize(new Dimension(width - 25, 50));
		emailPanel.setMinimumSize(new Dimension(width - 25, 50));
		emailPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);

		emailField = new JTextField();
		emailField.setPreferredSize(new Dimension(300, 35));
		emailField.setFont(ViewDetails.CLEARNF18);
		emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		emailField.setCaretColor(new java.awt.Color(252, 243, 48));
		emailField.setOpaque(false);

		emailPanel.add(emailField);
		this.add(emailPanel);


		JPanel commentLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		commentLabelPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel commentLabel = new JLabel(" * Comments");
		commentLabel.setFont(ViewDetails.CLEARNF16B);
		commentLabelPanel.add(commentLabel);
		this.add(commentLabelPanel);

		JPanel commentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		commentPanel.setPreferredSize(new Dimension(width - 25, 110));
		commentPanel.setMaximumSize(new Dimension(width - 25, 110));
		commentPanel.setMinimumSize(new Dimension(width - 25, 110));
		commentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);

		commentTextArea = new JTextArea();
		commentTextArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		commentTextArea.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		commentTextArea.setPreferredSize(new Dimension(width - 100, 100));
		commentTextArea.setMaximumSize(new Dimension(width - 100, 100));
		commentTextArea.setMinimumSize(new Dimension(width - 100, 100));
		commentTextArea.setLineWrap(true);
		commentTextArea.setFont(PhoenixLifeSetUpContentPanel.CONTENT_FONT);
		commentPanel.add(commentTextArea);

		this.add(commentPanel);

		JPanel attachmentLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		attachmentLabelPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JLabel attachmentLabel = new JLabel(" Attachments ");
		attachmentLabel.setFont(ViewDetails.CLEARNF16B);
		attachmentLabelPanel.add(attachmentLabel);
		this.add(attachmentLabelPanel);

		JPanel attachmentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		attachmentPanel.setPreferredSize(new Dimension(width - 25, 60));
		attachmentPanel.setMaximumSize(new Dimension(width - 25, 60));
		attachmentPanel.setMinimumSize(new Dimension(width - 25, 60));
		attachmentPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);

		final JTextField attachmentField = new JTextField();
		attachmentField.setPreferredSize(new Dimension(300, 35));
		attachmentField.setFont(ViewDetails.CLEARNF18);
		attachmentField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		attachmentField.setCaretColor(new java.awt.Color(252, 243, 48));
		attachmentField.setOpaque(false);

		attachmentPanel.add(attachmentField);

		fileChooser = new JFileChooser();

		JButton browseButton = new JButton(GuiUtility.getImageIcon("/images/browse.png"));
		browseButton.setBorder(null);
		browseButton.setFocusPainted(false);
		browseButton.setContentAreaFilled(false);
		browseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				attachmentField.setText("");
				int returnVal = fileChooser.showSaveDialog(DisscussionFormPage.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					selectedFile = fileChooser.getSelectedFile();
					attachmentField.setText(selectedFile.getName());
					LOG.info (" Saving: " + selectedFile.getName());
				} else {
					LOG.error(" Save command cancelled by user.");
				}

			}
		});


		attachmentPanel.add(browseButton);
		this.add(attachmentPanel);

		JPanel submitPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		submitPanel.setPreferredSize(new Dimension(width - 25, 50));
		submitPanel.setMaximumSize(new Dimension(width - 25, 50));
		submitPanel.setMinimumSize(new Dimension(width - 25, 50));
		submitPanel.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
		JButton submitButton = new JButton(GuiUtility.getImageIcon("/images/submit.png"));
		submitButton.setBorder(null);
		submitButton.setFocusPainted(false);
		submitButton.setContentAreaFilled(false);
		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				String fileName = "./Discussion/" + firstNameField.getText().toString().trim() + "_" + lastNameField.getText().toString().trim() +
						"_" + System.currentTimeMillis() + ".txt";
				saveTheData(fileName);

				LOG.info(" selectedFile " + selectedFile);
				if (selectedFile != null) {
					File destfile = new File("./Discussion/" + selectedFile.getName());
					try {
						copyDirectory(selectedFile, destfile);
						JOptionPane.showMessageDialog(DisscussionFormPage.this, "You suggestions is successfully submitted to us.");
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}

			}
		});

		submitPanel.add(submitButton);
		this.add(submitPanel);

		this.setBackground(ViewDetails.CLEARN_CONTENT_COLOR);
	}

	protected void saveTheData(String filename) {
		File file = null;
		FileOutputStream inFileOutputStream = null;
		DataOutputStream dos = null;
		try {
			file = new File(filename);
			if (!file.exists()) { 
				file.createNewFile();
			}

			inFileOutputStream = new FileOutputStream(file);
			dos = new DataOutputStream(inFileOutputStream);

			dos.write("Full Name".getBytes());

			String fullname = "\n" + firstNameField.getText().toString().trim() + " " + lastNameField.getText().toString().trim();
			dos.write(fullname.getBytes());

			dos.write("\nEmail".getBytes());

			String email = "\n" + emailField.getText().toString().trim();
			dos.write(email.getBytes());

			dos.write("\nComments".getBytes());

			String comments = "\n" + commentTextArea.getText().toString().trim();
			dos.write(comments.getBytes());

			dos.close();
		} catch (Exception e) {}
		finally {
			
			if (inFileOutputStream != null) { 
				try {
					inFileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
			if (dos != null) { 
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}

	}

	public void copyDirectory(File sourceLocation , File targetLocation) throws IOException {

		LOG.info(" sourceLocation " + sourceLocation.getAbsolutePath());
		LOG.info(" targetLocation " + targetLocation.getAbsolutePath());

		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i=0; i<children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]),
						new File(targetLocation, children[i]));
			}
		} else {

			if (!targetLocation.getParentFile().exists()) {
				targetLocation.getParentFile().mkdir();
			}

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}


}
