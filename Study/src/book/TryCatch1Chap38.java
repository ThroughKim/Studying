package book;

public class TryCatch1Chap38 {

	public static void main(String[] args){
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int형인지 확인");
			System.err.println(ee);
			ee.printStackTrace();
			System.err.println(ee.getMessage());
		} catch(Exception ee){
			System.out.println("제대로 입력");
			System.err.println(ee.getMessage());
			System.err.println(ee);
			ee.printStackTrace();
		} finally {
			System.out.println("반드시 실행됨");
		}
		
	}
}
