package study;

import java.awt.*;

import javax.swing.*;

public class Tester {
	JFrame jFrame;
	JPanel jPanelMaster;
	JButton jButtonSay;
	JTextField jTextField;
	
	final int WINDOW_SIZE_X = 450;
    final int WINDOW_SIZE_Y = 70;
    final int WINDOW_ANCHOR_X = 400;
    final int WINDOW_ANCHOR_Y = 70;
	final String WINDOW_TITLE = "Swing Tester";
	
	public Tester(){
		initComponents();
	}
	private void initComponents(){
		//jFrame.setTitle(WINDOW_TITLE);
		//jFrame.setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
		//jFrame.setLocation(WINDOW_ANCHOR_X, WINDOW_ANCHOR_Y);
		
		jPanelMaster = new JPanel();
		addWidgetsToPanel();
		
		jFrame.getContentPane().add(jPanelMaster);
		
		jFrame.setVisible(true);
	}
	private void addWidgetsToPanel(){
		jButtonSay = new JButton("Say");
		jTextField = new JTextField("Blank");
		
	}
	public static void main(String[] args){
		Tester ts = new Tester();
	}

}
