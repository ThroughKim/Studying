package study;
import java.util.Random;

public class Player {
int number = 0;
	public void guess() {
	Random rand = new Random();
	number = rand.nextInt(10);
	
	//System.out.println("찍은숫자 = "+number);
	}
	
}
