import javax.swing.*;

import java.awt.event.*;

class ReaderGUI extends JFrame {


  //-----------------------------------------------------------------
	Reader reader;
  //GUI components
	JPanel     jPanelReader;
	JLabel jLabelReader;
	static JTextArea jTextAreaScreen;
	JButton    jButtonRecommand, jButtonRegister, jButtonWithdraw, jButtonExit;

  //-----------------------------------------------------------------
  //class variable
	static private int GlobalID = 0;

  //-----------------------------------------------------------------
  //attributes
	private int ID = 0;
	private int parentsID;
	
	private String news;

/*======================================================================*
 *  constructor                                                         *
 *======================================================================*/
  //constructor
	
	public ReaderGUI() {
		GlobalID++;
		this.ID = GlobalID;
		this.parentsID = 0;

		createAndShowGUI();
	}
  //-----------------------------------------------------------------
    public ReaderGUI(int parentsID) {
		GlobalID++;
		this.ID = GlobalID;
		this.parentsID = parentsID;

		createAndShowGUI();
    }

/*======================================================================*
 *  GUI                                                                 *
 *======================================================================*/
  //-----------------------------------------------------------------
	private void createAndShowGUI() {

	  //set some attributes of JFrame
		this.setTitle("Reader (" + ID + ")");
		this.setSize(250, 400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//EXIT_ON_CLOSE, DISPOSE_ON_CLOSE, DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE

	  //create a Panel and add widgets on that Panel
		jPanelReader = new JPanel();
		addComponentsToPanel();     
    
		jLabelReader.setText("("+ID+")번 멤버, ("+parentsID+")번 멤버에게 추천받음.");

	  //attatch the Panel onto the contents pane of JFrame, and display
		this.getContentPane().add(jPanelReader); 
		this.setVisible(true);

	}
  //-----------------------------------------------------------------
	private void addComponentsToPanel() {
	
	  //create widgets
		jLabelReader = new JLabel();
		//jTextAreaScreen = new JTextField("               ");
		jTextAreaScreen = new JTextArea(15,20);

		jButtonRecommand = new JButton("Recommand");
		  //define ActionListener for this widget
			jButtonRecommand.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent evt) {
							jButtonRecommandIsPressed(evt);
					  }
					}
			);
			
		jButtonRegister = new JButton("Register");
		  //define ActionListener for this widget
			jButtonRegister.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent evt) {
							jButtonRegisterIsPressed(evt);
					  }
					}
				);

		jButtonWithdraw = new JButton("Withdraw");
		  //define ActionListener for this widget
			jButtonWithdraw.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent evt) {
							jButtonWithdrawIsPressed(evt);
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
		jPanelReader.add(jLabelReader);
		jPanelReader.add(jTextAreaScreen);
		jPanelReader.add(jButtonRecommand);
		jPanelReader.add(jButtonRegister);
		jPanelReader.add(jButtonWithdraw);
		jPanelReader.add(jButtonExit);
	}

/*======================================================================*
 *  events handlers                                                     *
 *======================================================================*/
	public static void notice(String news)
	{
		jTextAreaScreen.setText(news);
	}

  //-----------------------------------------------------------------
	private void jButtonRecommandIsPressed(ActionEvent evt) {
		ReaderGUI d = new ReaderGUI(this.ID);
	}
//-----------------------------------------------------------------
	private void jButtonRegisterIsPressed(ActionEvent evt) {
		DGPress dgpress = new DGPress();
		reader = new Reader(dgpress);
	}
//-----------------------------------------------------------------
	private void jButtonWithdrawIsPressed(ActionEvent evt) {

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
		ReaderGUI dg = new ReaderGUI();
	}
}
