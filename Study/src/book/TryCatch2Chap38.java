package book;

public class TryCatch2Chap38 {


	public static void main(String[] args){
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(nNum);
			System.out.println(a);
		}
		catch(Exception ee){
			System.out.println("제대로 입력");
			System.err.println(ee + "<====");
		} finally {
			System.out.println("반드시 실행됨");
		}
		
		try {
			//Divide by Zero
			int x = 5;
			int y = 20 / (5-x);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눴나 확인");
			e.printStackTrace();
		}
		
	}
}
