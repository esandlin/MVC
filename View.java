
/**
 * Copyright (c) 2015 Tim Lindquist,
 * Software Engineering,
 * Arizona State University at the Polytechnic campus
 * <p/>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation version 2
 * of the License.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but without any warranty or fitness for a particular purpose.
 * <p/>
 * Please review the GNU General Public License at:
 * http://www.gnu.org/licenses/gpl-2.0.html
 * see also: https://www.gnu.org/licenses/gpl-faq.html
 * so you are aware of the terms and your rights with regard to this software.
 * Or, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,USA
 * <p/>
 * Purpose: Sample Java Swing controller class. FolderBrowserGUI constructs the view components
 * for a sample GUI. This class is extends the GUI to provide the control functionality.
 * When the user does a tree node selection, this valueChanged is called, but virtue of being a
 * TreeSelectionListener and adding itself as a listerner. FolderBrowser defines the call-backs
 * for the JButton as well.
 * It contains sample control functions that respond to button clicks and tree
 * selects.
 * This software is meant to run on Debian Wheezy Linux
 * <p/>
 * Ser321 Principles of Distributed Software Systems
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist (Tim.Lindquist@asu.edu) CIDSE - Software Engineering,
 *                       IAFSE, ASU at the Polytechnic campus
 * @file    FolderBrowserGUI.java
 * @date    July, 2015
 **/

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class View extends JFrame {

	/**
	 * Json serialization
	 */
	private static final long serialVersionUID = -5258674991466487784L;

	private JLabel lblMessagesForEric = new JLabel("Messages for Eric Sandlin:");
	private JTextField subjectTextField = new JTextField(10);
	private JLabel subjectLabel = new JLabel("Subject:");
	private JLabel toLabel = new JLabel("To:");
	private JLabel fromLabel = new JLabel("From:");
	private JLabel dateLabel = new JLabel("Date:");
	private JLabel statusLabel = new JLabel("Status:");
	private JTextField toTextField = new JTextField(10);
	private JButton replyButton = new JButton("Reply");
	private JButton sendButton = new JButton("Send Text");
	private JButton deleteButton = new JButton("Delete");
	private JButton cypherButton = new JButton("Send Cypher");
	private JTextField dateTextField = new JTextField(10);
	private JTextField fromTextField = new JTextField(10);
	private JTextField messageTextField = new JTextField();
	private JTextField statusTextField = new JTextField();
	private JTree messageTree = new JTree();

	View() {

		// Sets up the view and adds the components

		JPanel Panel = new JPanel();

		this.setTitle("Eric Sandlins Message");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(613, 336);
		Panel.setLayout(null);
		subjectTextField.setBounds(275, 93, 116, 22);
		Panel.add(subjectTextField);
		subjectLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		subjectLabel.setBounds(211, 95, 52, 16);
		Panel.add(subjectLabel);
		statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		statusLabel.setBounds(233, 231, 57, 33);
		Panel.add(statusLabel);
		toLabel.setBounds(243, 46, 20, 16);
		Panel.add(toLabel);
		fromLabel.setBounds(403, 47, 35, 16);
		Panel.add(fromLabel);
		dateLabel.setBounds(403, 96, 35, 16);
		Panel.add(dateLabel);	
		messageTextField.setBounds(194, 127, 325, 81);
		Panel.add(messageTextField);
		messageTextField.setColumns(10);
		toTextField.setBounds(275, 43, 116, 22);
		Panel.add(toTextField);
		fromTextField.setBounds(450, 44, 116, 22);
		Panel.add(fromTextField);
		replyButton.setBounds(205, 5, 85, 25);
		Panel.add(replyButton);
		sendButton.setBounds(299, 5, 104, 25);
		Panel.add(sendButton);
		deleteButton.setBounds(108, 5, 85, 25);
		Panel.add(deleteButton);
		cypherButton.setBounds(415, 5, 116, 25);
		Panel.add(cypherButton);
		dateTextField.setBounds(450, 93, 116, 22);
		Panel.add(dateTextField);
		statusTextField.setColumns(10);
		statusTextField.setBounds(293, 231, 226, 33);
		Panel.add(statusTextField);
		lblMessagesForEric.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMessagesForEric.setBounds(12, 47, 156, 16);
		Panel.add(lblMessagesForEric);
		messageTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Messages") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("Eric Sandlin: Mon 16 Sept 22:54 1894");
				node_1.add(new DefaultMutableTreeNode("Get your homework done."));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("Eric Sandlin: Mon 16 Sept 22:54 1999");
				node_1.add(new DefaultMutableTreeNode("Don't forget to study."));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("Eric Sandlin: Mon 16 Sept 21:24 2012");
				node_1.add(new DefaultMutableTreeNode("Work Work Work Work Work."));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("Eric Sandlin: Mon 16 Sept 20:50 2015");
				node_1.add(new DefaultMutableTreeNode("I can do this, yes I can."));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("Eric Sandlin: Mon 16 Sept 01:14 2019");
				node_1.add(new DefaultMutableTreeNode("Maybe I need help."));
				add(node_1);
			}
		}));
		messageTree.setBounds(12, 76, 170, 188);
		Panel.add(messageTree);
		
		getContentPane().add(Panel);
		// End of setting up the components --------
	}

	/**
	 * @return
	 */
	public JTextField getSubjectTextField() {
		return subjectTextField;
	}

	/**
	 * @param subjectTextField
	 */
	public void setSubjectTextField(JTextField subjectTextField) {
		this.subjectTextField = subjectTextField;
	}

	/**
	 * @return
	 */
	public JTextField getToTextField() {
		return toTextField;
	}

	/**
	 * @param toTextField
	 */
	public void setToTextField(JTextField toTextField) {
		this.toTextField = toTextField;
	}

	/**
	 * @return
	 */
	public JTextField getDateTextField() {
		return dateTextField;
	}

	/**
	 * @param dateTextField
	 */
	public void setDateTextField(JTextField dateTextField) {
		this.dateTextField = dateTextField;
	}

	/**
	 * @return
	 */
	public JTextField getFromTextField() {
		return fromTextField;
	}

	/**
	 * @param fromTextField
	 */
	public void setFromTextField(JTextField fromTextField) {
		this.fromTextField = fromTextField;
	}

	/**
	 * @return
	 */
	public JTextField getMessageTextField() {
		return messageTextField;
	}

	/**
	 * @param messageTextField
	 */
	public void setMessageTextField(JTextField messageTextField) {
		this.messageTextField = messageTextField;
	}

	/**
	 * @return
	 */
	public JTextField getStatusTextField() {
		return statusTextField;
	}

	/**
	 * @param statusTextField
	 */
	public void setStatusTextField(JTextField statusTextField) {
		this.statusTextField = statusTextField;
	}

	/*
	 * If the calculateButton is clicked execute a method in the Controller
	 * named actionPerformed
	 */
	void addReplyListener(ActionListener listenForReplyButton) {
		replyButton.addActionListener(listenForReplyButton);
	}
	
	/*
	 * If the calculateButton is clicked execute a method in the Controller
	 * named actionPerformed
	 */
	void addDeleteListener(ActionListener listenForDeleteButton) {
		deleteButton.addActionListener(listenForDeleteButton);
	}
	
	/*
	 * If the calculateButton is clicked execute a method in the Controller
	 * named actionPerformed
	 */
	void addSendListener(ActionListener listenForSendButton) {
		sendButton.addActionListener(listenForSendButton);
	}
	
	/*
	 * If the calculateButton is clicked execute a method in the Controller
	 * named actionPerformed
	 */
	void addCypherListener(ActionListener listenForCypherButton) {
		cypherButton.addActionListener(listenForCypherButton);
	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}
}
