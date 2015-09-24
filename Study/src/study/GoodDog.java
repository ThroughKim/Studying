package study;

public class GoodDog {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("멍멍");
		} else if (size > 14) {
			System.out.println("멍멍");
		} else {
			System.out.println("찡찡");
		}
	}

}
