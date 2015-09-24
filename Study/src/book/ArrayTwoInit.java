package book;

public class ArrayTwoInit {

	public static void main(String[] args){
		System.out.println("2차원 배열방법 1");
		int[][] a = new int[4][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[3][2] = 5;
		println(a);
		
		System.out.println("2차원 배열 방법 2(JigJagged 가능여부)");
		int[][] b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[6];
		println(b);
		
		System.out.println("2차원 배열 방법 3");
		int[][] c = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(c);
		
		System.out.println(("2차원 배열 방법 4"));
		int[][]g = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(g);
		
		System.out.println("copy1");
		int[][]d = new int[c.length][c[0].length];
		for(int i=0 ; i<c.length ; i++){
			System.arraycopy(c[i], 0, d[i], 0, d[i].length);
		}
		c[0][0] = -5;
		println(d);
		
		System.out.println("copy2");
		int[][]e = new int[c.length][c[0].length];
		System.arraycopy(c, 0, e, 0, e.length);
		c[0][0] = -4;
		println(e);
		
		System.out.println("copy3");
		int[][] f = new int[c.length][c[0].length];
		f=e;
		e[0][0] = -400;
		println(f);
	}

	private static void println(int[][] p) {
		for(int i=0 ; i<p.length ; i++){
			for(int j=0 ; j<p[i].length ; j++){
				System.out.print("["+p[i][j]+"]");
			}
			System.out.println();
		}
		
	}
}