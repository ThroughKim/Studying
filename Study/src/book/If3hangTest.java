package book;

public class If3hangTest {
	public static void main(String[] args){
		int year = 2004;
		
		String sEven = ((year%2==0)?"짝수해":"홀수해");
		System.out.printf("%d는 %s 입니다. %n",year,((year%2==0)?"짝수해":"홀수해"));
		System.out.printf("%d는 %s 입니다.%n",year,sEven);
	}
}
