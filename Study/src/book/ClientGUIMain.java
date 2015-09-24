package book;

public class ClientGUIMain {
	public static void main(String[] args){
		StartingJFrame frame = new StartingJFrame();
		ClientGUI bp = new ClientGUI(frame,"127.0.0.1",5357);
		bp.giveAndTake();
		frame.setMainJpanel(bp);
		frame.setSize(550,400);
		frame.validate();
	}
}
