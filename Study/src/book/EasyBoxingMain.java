package book;

public class EasyBoxingMain {

	public static void main(String[] args){
		// 박싱/언박싱은 JAVA5 부터
		
		int intNm1 =123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		
		Integer intWrap1 = new Integer(187);
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		Object obj = new Object();
		
		Integer intWrap2 = intNm1;				//박싱
		intNm1 = intWrap2;						//언박싱 intNm1 = (int)int Wrap;
		
		obj = longWrap1;						//상속관계(계층) 프로모션
		longWrap1 = (Long)obj;					//상속관계(계층) 캐스팅
		obj = intNm1;							//박싱-->obj = new new Integer(intNm)
		intNm1 = (Integer)obj;					//언박싱--> ((Integer)obj).intValue();
		System.out.println(intNm1);		
	}
}
