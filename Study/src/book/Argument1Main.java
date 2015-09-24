package book;

public class Argument1Main {
	public static void main(String[] args){
		int myMoney = 500;
		int cups = coffee(myMoney , 300);
		printCoffee(cups);
		
		int noChange = 400;
		coffeeIn(noChange);
		System.out.print("main: ");
		System.out.println("sChange는 "+noChange+"다.");
		
		String sChange = "Suru";
		coffeeIn(sChange);
		System.out.print("main: ");
		System.out.println("sChange는 "+sChange+"다.");
	}
	
	public static void coffeeIn(int money){
		money += 300;
		money /= 50;
		System.out.print("method coffeeIn: ");
		System.out.println("money는 "+money+"원이다.");
	}
	public static void coffeeIn(String money){					//immutable
		money = money.replace('u', 'o');
		money += "안녕";										//메서드 안에서만 바뀜
		System.out.print("method coffeeIn: ");
		System.out.println("money는 "+money+"다.");
	}
	public static int coffee(int money, int coffeeValue){
		if(coffeeValue <= 100){
			return -1;
		}
		int cups = -1;
		if(money > 0){
			cups = money/coffeeValue;
		}
		return cups;
	}
	
	public static int coffee(int money){
		return coffee(money,200);
	}
	public static void printCoffee(int cups){
		if(cups > 1){
			System.out.println("커피 "+cups+"잔 나왔습니다.");
		}else{
			System.out.println("돈을 더 넣어주세욘");
		}
	}
}
