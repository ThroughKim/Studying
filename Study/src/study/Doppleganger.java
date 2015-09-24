package study;

import javax.swing.*;
import java.awt.event.*;

class Doppelganger extends JFrame {

   // CenterScreen centerScreen;
  //-----------------------------------------------------------------
  //GUI components
	JPanel     jPanel;
	JTextField jTextFieldScreen;
	JButton    jButtonClone, jButtonExit;

  //-----------------------------------------------------------------
  //class variable
	static private int GlobalID = 0;

  //-----------------------------------------------------------------
  //attributes
	private int ID = 0;
	private int parentsID;

/*======================================================================*
 *  constructor                                                         *
 *======================================================================*/
  //constructor
    public Doppelganger() {
		GlobalID++;
		this.ID = GlobalID;
		this.parentsID = 0;

		createAndShowGUI();
	}
  //-----------------------------------------------------------------
    public Doppelganger(int parentsID) {
		GlobalID++;
		this.ID = GlobalID;
		this.parentsID = parentsID;

		createAndShowGUI();
    }
  //-----------------------------------------------------------------
    public void finalize() {
	  String message = "<< I'm (" + ID + "). Now I'm killed by user. ";
	  JOptionPane.showMessageDialog(null, message, "������� ���", JOptionPane.ERROR_MESSAGE);
    }

/*======================================================================*
 *  GUI                                                                 *
 *======================================================================*/
  //-----------------------------------------------------------------
	private void createAndShowGUI() {

       // centerScreen = new CenterScreen();

	  //set some attributes of JFrame
		this.setTitle("Doppelganger (" + ID + ")");
		this.setSize(300, 110);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      //  this.setLocation(centerScreen.getCenterPoint(this));

			//EXIT_ON_CLOSE, DISPOSE_ON_CLOSE, DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE

	  //create a Panel and add widgets on that Panel
		jPanel = new JPanel();
		addComponentsToPanel();     
    
		jTextFieldScreen.setText("  I am No.(" + ID + "), created by [" + parentsID + "]  ");

	  //attatch the Panel onto the contents pane of JFrame, and display
		this.getContentPane().add(jPanel); 
		this.setVisible(true);

	}
  //-----------------------------------------------------------------
	private void addComponentsToPanel() {
	
	  //create widgets
		//jTextFieldScreen = new JTextField("               ");
		jTextFieldScreen = new JTextField(15);

		jButtonClone = new JButton("Clone");
		  //define ActionListener for this widget
			jButtonClone.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent evt) {
							jButtonCloneIsPressed(evt);
					  }
					}
			);		
		jButtonExit = new JButton("Exit");
		  //define ActionListener for this widget
			jButtonExit.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent evt) {
							jButtonExitIsPressed(evt);
					  }
					}
			);	

	  //add created widgets onto the panel
		jPanel.add(jTextFieldScreen);
		jPanel.add(jButtonClone);
		jPanel.add(jButtonExit);
	}

/*======================================================================*
 *  events handlers                                                     *
 *======================================================================*/
  //-----------------------------------------------------------------
	private void jButtonCloneIsPressed(ActionEvent evt) {
		Doppelganger d = new Doppelganger(this.ID);
	}
  //-----------------------------------------------------------------
	private void jButtonExitIsPressed(ActionEvent evt) {
		//Terminates the currently running Java Virtual Machine.
		//System.exit(0); //terminate JVM

		//Releases all of the native screen resources used by this Window, 
		//  its subcomponents, and all of its owned children.
		this.dispose();

	}
/*======================================================================*
 *  application launcher                                                     *
 *======================================================================*/
  //-----------------------------------------------------------------
	public static void main(String[] args) 	{
		Doppelganger dg = new Doppelganger();
	}
}
