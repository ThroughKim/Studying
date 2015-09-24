package book;

public class ArrayCloneCopys {

	public static void main(String[] args){
		int[] a = {8,5,2,4,6,3,7,9};
		int[] b = {8,5,2,4,6,3,7,9};
		int[] c = a;									//reference assignment copy
		int[] d = new int[b.length];
		System.arraycopy(b,0,d,0,b.length);				//value assignment copy
		
		//clone 을 지원하지 않으면 CloneNotSupportedException 발생
		int[] e = (int[])b.clone();
		print(e);
		b[4] = -2;
		print(e);
	}

	private static void print(int[] p) {
		for(int i=0 ; i<p.length ; i++){
			System.out.print("["+p[i]+"]");
		}
		System.out.println();
	}
	
	private static void print(int[][] p){
		for(int i=0; i<p.length ; i++){
			for(int j =0; j<p[i].length ; j++){
				System.out.println("["+p[i][j]+"]");
			}
		}
		System.out.println();
	}
}
