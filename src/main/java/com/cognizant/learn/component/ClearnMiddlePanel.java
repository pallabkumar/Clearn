package com.cognizant.learn.component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import com.cognizant.learn.content.ContentMenuWiseContentPanelMapper;
import com.cognizant.learn.content.IntroductionContentPanel;
import com.cognizant.learn.content.PhoenixLifeSetUpContentPanel;
import com.cognizant.learn.utilities.GuiUtility;
import com.cognizant.learn.utilities.ViewDetails;
import com.cognizant.learn.view.CLearnClient;

public class ClearnMiddlePanel extends JPanel implements CommonFunctionalInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2259007765437794654L;

	public static int CONTENT_ID = ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID; 


	private JPanel leftSideTableOfContentScrollPanel;
	private JScrollPane leftSideTableOfContentScrollPane;
	private int width, height;
	private IntroductionContentPanel introductionContentPanel;
	private PhoenixLifeSetUpContentPanel phoenixLifeSetUpContentPanel;
	private JTree contentMenuTree;
	private DefaultMutableTreeNode contentMenuRoot;
	private JScrollPane contentMenuTreePane;
	private CommonFunctionalInterface commonFunctionalInterface;
	
	public void setCommonFunctionalInterface(CommonFunctionalInterface commonFunctionalInterface) {
		this.commonFunctionalInterface = commonFunctionalInterface;
	}

	public IntroductionContentPanel getIntroductionContentPanel() {
		return introductionContentPanel;
	}

	public PhoenixLifeSetUpContentPanel getPhoenixLifeSetUpContentPanel() {
		return phoenixLifeSetUpContentPanel;
	}

	private JPanel rightSideTableOfContentPanel;

	public ClearnMiddlePanel(int width, int height) {

		this.width = width;
		this.height = height;

		leftSideTableOfContentScrollPanel = new JPanel();

		leftSideTableOfContentScrollPanel.setPreferredSize(new Dimension(width * 23/100, height - 10));
		leftSideTableOfContentScrollPanel.setMaximumSize(new Dimension(width * 23/100, height - 10));
		leftSideTableOfContentScrollPanel.setMinimumSize(new Dimension(width * 23/100, height - 10));

		leftSideTableOfContentScrollPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		leftSideTableOfContentScrollPanel.setLayout(new BoxLayout(leftSideTableOfContentScrollPanel, BoxLayout.Y_AXIS));

		JPanel tableOfContentHeaderPanel = new JPanel();
		tableOfContentHeaderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tableOfContentHeaderPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		tableOfContentHeaderPanel.setPreferredSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMaximumSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMinimumSize(new Dimension(width * 23/100, 60));

		// header label
		JLabel headerLabel = new JLabel("Table of Contents");
		headerLabel.setFont(ViewDetails.CLEARNF25B);
		tableOfContentHeaderPanel.add(headerLabel);
		leftSideTableOfContentScrollPanel.add(tableOfContentHeaderPanel);

		contentMenuRoot = new DefaultMutableTreeNode("Root");

		UIManager.put("Tree.paintLines", Boolean.FALSE);
		Icon empty = new TreeIcon();
		UIManager.put("Tree.closedIcon", GuiUtility.getImageIcon("/images/tag_element.png"));
		UIManager.put("Tree.openIcon", GuiUtility.getImageIcon("/images/tag_element.png"));
		UIManager.put("Tree.collapsedIcon", empty);
		UIManager.put("Tree.expandedIcon", empty);
		UIManager.put("Tree.leafIcon", empty);

		populateOtherContentMenus();

		contentMenuTree = new JTree(contentMenuRoot);
		contentMenuTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
//		contentMenuTree.setBorder(BorderFactory.createLineBorder(Color.red));

		MyTreeCellRenderer renderer = new MyTreeCellRenderer();       
		renderer.setLeafIcon(GuiUtility.getImageIcon("/images/tag_element.png"));

		contentMenuTree.setCellRenderer(renderer);
		contentMenuTree.setShowsRootHandles(true);
		contentMenuTree.setRootVisible(false);

		contentMenuTree.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseClicked(MouseEvent e) {
				TreePath treepath = contentMenuTree.getPathForLocation(e.getX(), e.getY());
				if (treepath != null) {
					String lastPathComponent = treepath.getLastPathComponent().toString();
					for (Entry<String, Integer> contentIdMap : ContentMenuWiseContentPanelMapper.contentPanelWiseContentMenuMap.entrySet()) {
						if (lastPathComponent.equals(contentIdMap.getKey())) {
							CONTENT_ID = contentIdMap.getValue();
							populateContent();
						}
					}

					if (ContentMenuWiseContentPanelMapper.contentIdVSSubmenuPageNumberMapping.containsKey(CONTENT_ID)) {
						HashMap<String, Integer> submenuPageNumberMapping = ContentMenuWiseContentPanelMapper.contentIdVSSubmenuPageNumberMapping.get(CONTENT_ID);

						for (Entry<String, Integer> submenuPageNumberMap : submenuPageNumberMapping.entrySet()) {
							if (lastPathComponent.equals(submenuPageNumberMap.getKey())) {
								int contentIndex = submenuPageNumberMap.getValue();
								phoenixLifeSetUpContentPanel.setContentIndex(contentIndex);
								phoenixLifeSetUpContentPanel.populatePhoenixLifeContentPanel();
								
								if (commonFunctionalInterface != null) {
									commonFunctionalInterface.buttonStatusChange();
								}
							}
						}
					}
				}
			}
		});

		contentMenuTree.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);

		contentMenuTreePane = new JScrollPane(contentMenuTree);
		contentMenuTreePane.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		contentMenuTreePane.setBorder(BorderFactory.createEmptyBorder());
		contentMenuTreePane.getVerticalScrollBar().setPreferredSize(new Dimension(5, 0));
		contentMenuTreePane.getVerticalScrollBar().setMinimumSize(new Dimension(5, 0));
		contentMenuTreePane.getVerticalScrollBar().setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		contentMenuTreePane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 5));
		contentMenuTreePane.getHorizontalScrollBar().setMinimumSize(new Dimension(0, 5));
		contentMenuTreePane.getHorizontalScrollBar().setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);

		leftSideTableOfContentScrollPanel.add(contentMenuTreePane);


		leftSideTableOfContentScrollPane = new JScrollPane(leftSideTableOfContentScrollPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		leftSideTableOfContentScrollPane.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		leftSideTableOfContentScrollPane.setBorder(BorderFactory.createLineBorder(ViewDetails.CLEARN_CONTENT_HEADER_COLOR));
		leftSideTableOfContentScrollPane.setPreferredSize(new Dimension(width * 25/100, height));
		leftSideTableOfContentScrollPane.setMaximumSize(new Dimension(width * 25/100, height));
		leftSideTableOfContentScrollPane.setMinimumSize(new Dimension(width * 25/100, height));

		leftSideTableOfContentScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {}
		});

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(leftSideTableOfContentScrollPane);

		rightSideTableOfContentPanel = new JPanel();
		//	    rightSideTableOfContentPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		rightSideTableOfContentPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		rightSideTableOfContentPanel.setPreferredSize(new Dimension(width * 75/100, height));
		rightSideTableOfContentPanel.setMaximumSize(new Dimension(width * 75/100, height));
		rightSideTableOfContentPanel.setMinimumSize(new Dimension(width * 75/100, height));

		populateContent();

		this.add(rightSideTableOfContentPanel);

		this.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));

	}

	private class TreeIcon implements Icon {

		private static final int SIZE = 0;

		public TreeIcon() {
		}

		public int getIconWidth() {
			return SIZE;
		}

		public int getIconHeight() {
			return SIZE;
		}

		public void paintIcon(Component c, Graphics g, int x, int y) {}
	}

	private static class MyTreeCellRenderer extends DefaultTreeCellRenderer {

		/**
		 * 
		 */
		private static final long serialVersionUID = -4944873798250534895L;

		@Override
		public Color getBackgroundNonSelectionColor() {
			return (null);
		}

		@Override
		public Color getBackgroundSelectionColor() {
			return ViewDetails.CLEARN_FOOTER_COLOR_TWO;
		}

		@Override
		public Color getBackground() {
			return (null);
		}

		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
			super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
			
			if(CLearnClient.FULL_SCREEN_WIDTH >=1900) {
				setFont(ViewDetails.CLEARNF18B);
			} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1600) {
				setFont(ViewDetails.CLEARNF16B);
			} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1400) {
				setFont(ViewDetails.CLEARNF16B);
			} else {
				setFont(ViewDetails.CLEARNF16B);
			}

			Border border = BorderFactory.createEmptyBorder (10, 10, 10, 10);
			JLabel label = ( JLabel ) super
					.getTreeCellRendererComponent ( tree, value, sel, expanded, leaf, row,
							hasFocus );
			label.setBorder(border);

			return this;
		}

	}

	private void populateContent() {

		rightSideTableOfContentPanel.removeAll();
		rightSideTableOfContentPanel.repaint();
		rightSideTableOfContentPanel.validate();

		int contentPanelWidth = width * 70/100;
		int contentPanelheight = height * 80/100;

		if(CLearnClient.FULL_SCREEN_WIDTH >= 1600) {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		} else if(CLearnClient.FULL_SCREEN_WIDTH >= 1400) {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		} else {
			contentPanelWidth = width * 70/100;
			contentPanelheight = height * 90/100;
		}

		if (CONTENT_ID == ContentMenuWiseContentPanelMapper.INTRODUCTION_CONTENT_ID) {
			introductionContentPanel = new IntroductionContentPanel(contentPanelWidth, contentPanelheight);
			rightSideTableOfContentPanel.add(introductionContentPanel);
		} else if (CONTENT_ID == ContentMenuWiseContentPanelMapper.PHOENIX_LIFE_SETUP_CONTENT_ID) {
			phoenixLifeSetUpContentPanel = new PhoenixLifeSetUpContentPanel(contentPanelWidth, contentPanelheight);
			rightSideTableOfContentPanel.add(phoenixLifeSetUpContentPanel);
		}

		ClearnRightLowerButtonPanel clearnRightLowerButtonPanel = new ClearnRightLowerButtonPanel(this, contentPanelWidth, height * 10/100);
		rightSideTableOfContentPanel.add(clearnRightLowerButtonPanel);

		rightSideTableOfContentPanel.repaint();
		rightSideTableOfContentPanel.validate();
	}

	private void populateOtherContentMenus() {

		leftSideTableOfContentScrollPanel.removeAll();
		leftSideTableOfContentScrollPanel.repaint();
		leftSideTableOfContentScrollPanel.validate();

		JPanel tableOfContentHeaderPanel = new JPanel();
		tableOfContentHeaderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tableOfContentHeaderPanel.setBackground(ViewDetails.CLEARN_BODY_COLOR_TWO);
		tableOfContentHeaderPanel.setPreferredSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMaximumSize(new Dimension(width * 23/100, 60));
		tableOfContentHeaderPanel.setMinimumSize(new Dimension(width * 23/100, 60));

		JLabel headerLabel = new JLabel("Table of Contents");
		headerLabel.setFont(ViewDetails.CLEARNF25B);
		tableOfContentHeaderPanel.add(headerLabel);
		leftSideTableOfContentScrollPanel.add(tableOfContentHeaderPanel);

		for (Entry<Integer, String> contentMenuMap : ContentMenuWiseContentPanelMapper.contentMenuWiseContentPanelMap.entrySet()) {
			DefaultMutableTreeNode contentMenuNode = new DefaultMutableTreeNode(contentMenuMap.getValue());

			if (ContentMenuWiseContentPanelMapper.contentMenuWiseSubMenuList.size() > 0) {
				if (ContentMenuWiseContentPanelMapper.contentMenuWiseSubMenuList.containsKey(contentMenuMap.getKey())) {
					ArrayList<String> contentSubMenuList = ContentMenuWiseContentPanelMapper.contentMenuWiseSubMenuList.get(contentMenuMap.getKey());
					for (String subMenuStr : contentSubMenuList) {
						contentMenuNode.add(new DefaultMutableTreeNode(subMenuStr));
					}
				}
			}

			contentMenuRoot.add(contentMenuNode);
		}
	}

	@Override
	public void buttonStatusChange() {}

}
