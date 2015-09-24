package book;

public class AssignMain {

	public static void main(String[] args){
		int intNm1 =123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		
		Integer intWrap1 = new Integer(187);
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		String str = "Hello Java 7";
		String newStr = new String("Hello");
		Object obj = new Object();
		
		Student stu = new Student();
		
		doubleNum = longNum1;				//Primitive 프로모션
		intNm1 = (int)doubleNum;			//Primitive 캐스팅
		longNum1 = longWrap1.longValue();	//pri <--> wrap
		
		//longWarp1 = intWarp1;				//reference typ dismatch
	}
}
