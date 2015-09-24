package book;

public class LiteralTest {
	public static void main(String[] args){
		System.out.println("Hello\nMy name is SeulWoo Kim");
		System.out.println("My Uncle\'s book");
		System.out.println("Hucks\b High");
		System.out.println("이 표시(//)를 보면 4를 누르시오");
		System.out.println("예를들어 \"를 사용할 수 있다.");
		System.out.println(0xFA);//250 15진수
		System.out.println(0222);//146 8진수
		
		for (int i = 0; i < 255; i++) {
			System.out.print((char)i+"");

		}
	}
}

