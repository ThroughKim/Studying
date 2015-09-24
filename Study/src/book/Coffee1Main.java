package book;

public class Coffee1Main {
	public static void main(String[] args){
		int myMoney = 800;					//800원은 커피 몇 잔일까?
		int cups = 0;						//몇 잔 나올까 준비
		if(myMoney > 0){
			cups = myMoney/200;				//커피몇잔
		}else if(myMoney == 0){
			cups = 0;
		}else{
			cups = -1;
		}
		
		if(cups>0){
			System.out.println("커피 ㄴ"+cups+"잔 나왔습니다");
			System.out.printf("커피 %d잔 나왔습니다",cups);
		}else{
			System.out.println("돈을 더 넣어주세요");
		}
		
	}
}
