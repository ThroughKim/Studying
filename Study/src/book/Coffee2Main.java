package book;

public class Coffee2Main {
	public static void main(String[] args){
		int myMoneyA = 800;
		int cupsA =Coffee2Main.coffee(myMoneyA);
		Coffee2Main.printCoffee(cupsA);
		
		int myMoneyB = 150;
		int cupsB = Coffee2Main.coffee(myMoneyB);
		Coffee2Main.printCoffee(cupsB);
		
	}
	
	public static int coffee(int money){
		int cups = 0;
		if(money > 0){
			cups = money/200;
		}else if(money == 0){
			cups = 0;
		}else{
			cups = -1;
		}
		return cups;
	}
	public static void printCoffee(int cups){
		if(cups > 1){
			System.out.println("커피 "+cups+"잔 나왔습니다.");
		}else{
			System.out.println("돈을 더 넣어주세욘");
		}
	}
}
