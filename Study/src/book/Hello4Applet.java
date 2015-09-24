package book;
import javax.swing.*;
import java.awt.*;

public class Hello4Applet extends JApplet{
	private static final long serialVersionUID = 122343214237L;
	public void init(){
		
	}
	public void start(){
		
	}
	public void paint(Graphics g){
		super.paint(g);		//습관적으로 쓰자.
		g.drawString("안녕하세요. 자바를 즐깁시다.", 50, 50);
		for (int year=1998 ; year<2006 ; year++){
			boolean yearTF = false;
			if((0==(year%4)&& 0!=(year%100)) || 0 == year%400){
				yearTF = true;
			}else{
				yearTF = false;
			}
			if(yearTF){
				g.drawString(year+"는 윤년입니다.", 50, 50+(year-1997)*20);
			}else{
				g.drawString(year+"는 윤년이 아닙니다.",50, 50+(year-1997)*20);
			}
		}
	}
}
