package book;
//section 10
public class TypeTest {
	public static void main(String[] args){
		byte ba = 10;
		byte bb = 20;
		byte bc = 10+20;
		//byte bd=ba+bb						//타입 캐스팅 에러
		byte be = (byte)(ba+bb);
		System.out.println(bc);
		System.out.println(be);
		
		short sa = 30;
		short sb = 50;
		short sc = 30+50;
		//short sd = sa+sb					//타입 캐스팅 에러
		short se = (short)(sa=sb);
		System.out.println(sc);
		System.out.println(se);
		
		int ia = 20;
		int ib = 30;
		int ic = 20+30;
		int id = ic+sa;						//sa는 변수이므로 int가 된다
		System.out.println(ic);
		
		long la = 40l;
		long lb = 50L;
		long lba = 50+Integer.MAX_VALUE;	// (int+int) 음수가 됨
		long lbb = 50L+Integer.MAX_VALUE;	// (long+int) 양수가 됨
		long lc = la+lb;
		System.out.println(lba);
		System.out.println(lbb);
		System.out.println(lc);
		
		float fa = 45.0f;
		float fb = 46.67F;
		//float fc = 30.4;					//F가 없으면 long타입이 된다
		float fd = 30;						//int는 자동으로 float이 됨
		float fe = fa+fb;
		
		double da = 12;
		double db = 45+Float.MAX_VALUE;
		double dc = da+db;
		System.out.println(dc);
		
		System.out.println("byte의 범위 : "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("short의 범위 : "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("int의 범위 : "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("long의 범위 : "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("float 양의 범위 : "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
		System.out.println("double의 범위 : "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
	}
}
