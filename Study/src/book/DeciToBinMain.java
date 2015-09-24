package book;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class DeciToBinMain {

	public static void main(String[] args){
		int a = 69;
		//Integer.Integer
		System.out.println("1: 69 to 2진수: "+Integer.toBinaryString(a));
		System.out.println("2: 69 to 2진수: "+(Integer.toBinaryString(-a)));
		
		//Integer.toOctalString(int i)
		System.out.println("3: 69 to 8진수: "+ (Integer.toOctalString(a)));
		System.out.println("4: 69 to 8진수: "+ (Integer.toOctalString(-a)));
		
		//Integer.toHexString(int i)
		System.out.println("5: 69 to 16진수: "+ (Integer.toHexString(a)));
		System.out.println("6: 69 to 16진수: "+ (Integer.toHexString(-a)));
		
		double i = 65.65;
		
		//Double.toHexString(double i)
		System.out.println("7: 54.54 to 16진수: "+(Double.toHexString(i)));
		System.out.println("8: 54.54 to 16진수: "+(Double.toHexString(-i)));
		
		Integer ide = Integer.decode("1");
		System.out.println("9: "+ide.intValue());
		System.out.println("10: 69revers   "+Integer.reverseBytes(a) );
		
		
	}
}
