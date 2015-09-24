package book;

public class ArrayInit {

	public static void main(String[] args){
		//기본타입의 배열 사용 방법 1 선언
		int[] a = null;
		//정의
		a = new int[5];
		//초기화 initiation
		a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
		
		//방법 2 선언 정의 초기화
		int[] b = new int[]{2,3,4,5,6};
		
		//방법 3 선언 정의 초기화
		int[] c = {1,2,3,4,5};
		
		for (int i=0 ; i<a.length ; i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		int[] d = a;
		a[4] = 55;
		for (int i=0 ; i<a.length ; i++){
			System.out.print(d[i]+"\t");
		}
		System.out.println();
		
		int[] e = new int[5];
		System.arraycopy(d, 0, e, 0, d.length);
		d[4] = 100;
		
		for (int i=0 ; i<a.length ; i++){
			System.out.print(e[i]+"\t");
		}
		System.out.println();
	}
}
