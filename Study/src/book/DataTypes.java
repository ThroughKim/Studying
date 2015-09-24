package book;
//Section 9
public class DataTypes {
	public static void main(String[] args){
		//기본타입
		int primitiveInt = 19;
		double primitiveLong = 3.1453;
		//참조타입
		String refStr = "안녕하세요";
		Object refObj = new Object();
		//랩퍼클래스
		Integer wrapInt = new Integer(19);
		Double wrapDouble = new Double(3.1453);
		//배열
		int[] a = {1,2,3};
		
		System.out.println(primitiveInt);
		System.out.println(primitiveLong);
		System.out.println(refStr);
		System.out.println(refStr.indexOf('녕'));
		System.out.println(refStr.hashCode());
		System.out.println(refObj);
		System.out.println(refObj.getClass());
		System.out.println(refObj.hashCode());
		System.out.println(wrapInt);
		System.out.println(wrapInt.intValue());
		System.out.println(wrapDouble);
		System.out.println(wrapDouble.doubleValue());
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[1]);
	}
}
