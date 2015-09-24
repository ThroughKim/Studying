package book;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartingJFrame extends JFrame {
	private static final long serialVersionUID = 122454214237L;
	JPanel mainp;
	
	public StartingJFrame(){
		System.out.println(this.getClass().getName()+"Start!");
		inits();
	}
	
	private void inits(){
		mainp = (JPanel) this.getContentPane();
		mainp.setLayout(new BorderLayout());
		this.setSize(400, 300);
		initFrame();
		this.setTitle(this.getClass().getName());
	}
	
	public void addActionListener(){}
	private void initFrame(){
		Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if(frameSize.height > monitorSize.height){
			frameSize.height = monitorSize.height;
		}
		if(frameSize.width > monitorSize.width){
			frameSize.width = monitorSize.width;
		}
		int locationX = (monitorSize.width - frameSize.width) / 2;
		int locationY = (monitorSize.height - frameSize.width) / 2;
		this.setLocation(locationX, locationY);
		this.setVisible(true);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		}
	
	public void processWindowEvent(WindowEvent e){
		super.processWindowEvent(e);
		if(e.getID() == WindowEvent.WINDOW_CLOSING){
			System.out.println(this.getClass().getName()+"End!!");
			System.exit(1);
		}
	}
	public void setMainJpanel(javax.swing.JComponent c){
		mainp.add(c);
	}
	
}
