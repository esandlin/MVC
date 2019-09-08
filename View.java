
// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class View extends JFrame{

	private JTextField subjectTextField  = new JTextField(10);
	private JLabel subjectLabel = new JLabel("Subject:");
	private JTextField toTextField = new JTextField(10);
	private JButton replyButton = new JButton("Reply");
	private JTextField dateTextField = new JTextField(10);
	private JTextField fromTextField;
	private JTextField messageTextField;
	private JTextField statusTextField;
	
	View(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(613, 336);
		calcPanel.setLayout(null);
		subjectTextField.setBounds(275, 93, 116, 22);
		
		calcPanel.add(subjectTextField);
		subjectLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		subjectLabel.setBounds(211, 95, 52, 16);
		calcPanel.add(subjectLabel);
		toTextField.setBounds(275, 43, 116, 22);
		calcPanel.add(toTextField);
		replyButton.setBounds(205, 5, 85, 25);
		calcPanel.add(replyButton);
		dateTextField.setBounds(450, 93, 116, 22);
		calcPanel.add(dateTextField);
		
		getContentPane().add(calcPanel);
		
		fromTextField = new JTextField(10);
		fromTextField.setBounds(450, 44, 116, 22);
		calcPanel.add(fromTextField);
		
		JLabel toLabel = new JLabel("To:");
		toLabel.setBounds(243, 46, 20, 16);
		calcPanel.add(toLabel);
		
		JLabel fromLabel = new JLabel("From:");
		fromLabel.setBounds(403, 47, 35, 16);
		calcPanel.add(fromLabel);
		
		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setBounds(403, 96, 35, 16);
		calcPanel.add(dateLabel);
		
		JButton sendButton = new JButton("Send Text");
		sendButton.setBounds(299, 5, 104, 25);
		calcPanel.add(sendButton);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setBounds(108, 5, 85, 25);
		calcPanel.add(deleteButton);
		
		JButton cypherButton = new JButton("Send Cypher");
		cypherButton.setBounds(415, 5, 116, 25);
		calcPanel.add(cypherButton);
		
		messageTextField = new JTextField();
		messageTextField.setBounds(194, 127, 325, 81);
		calcPanel.add(messageTextField);
		messageTextField.setColumns(10);
		
		statusTextField = new JTextField();
		statusTextField.setColumns(10);
		statusTextField.setBounds(293, 231, 226, 33);
		calcPanel.add(statusTextField);
		
		JLabel statusLabel = new JLabel("Status:");
		statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		statusLabel.setBounds(233, 231, 57, 33);
		calcPanel.add(statusLabel);
		
		JLabel lblMessagesForEric = new JLabel("Messages for Eric Sandlin:");
		lblMessagesForEric.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMessagesForEric.setBounds(12, 47, 156, 16);
		calcPanel.add(lblMessagesForEric);
		
		JTree messageTree = new JTree();
		messageTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Messages") {
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
			}
		));
		messageTree.setBounds(12, 76, 170, 188);
		calcPanel.add(messageTree);
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(subjectTextField.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(toTextField.getText());
		
	}
	
	public int getCalcSolution(){
		
		return Integer.parseInt(dateTextField.getText());
		
	}
	
	public void setCalcSolution(int solution){
		
		dateTextField.setText(Integer.toString(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		replyButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
}