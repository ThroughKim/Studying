package study;
import java.util.Random;

public class GuessGame {
	
	Random rand = new Random();
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int target = rand.nextInt(10);		
		
		while(true){
			
		p1.guess();
		p2.guess();
		p3.guess();
		
		System.out.println("맞춰야 할 숫자 ="+target);

		
		int guessNum1 = p1.number;
		System.out.println("1번선수가 찍은 숫자 ="+guessNum1);
		int guessNum2 = p2.number;
		System.out.println("2번선수가 찍은 숫자 ="+guessNum2);
		int guessNum3 = p3.number;
		System.out.println("3번선수가 찍은 숫자 ="+guessNum3);
		
		if (target == guessNum1){
			System.out.println("1번 선수가 맞췄습니다.");
			break;
		}
		else if (target == guessNum2){
			System.out.println("2번 선수가 맞췄습니다");
			break;
		}
		else if (target == guessNum3){
			System.out.println("3번 선수가 맞췄습니다.");
			break;
		}
		else {
			System.out.println("아무도 맞추지 못했습니다. 다시 진행합니다.");
		}
		}

	}

}
