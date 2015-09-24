package book;

public class StringTest1Main {
	public static void main(String[] args){
		//String concatenation
		String sname = "";
		sname+="Antony";
		sname+="Sedas";
		sname+=6+"th";
		//String subString
		System.out.println("1:      01234567890123456789");
		System.out.println("2: Name    :"+sname);
		sname = sname.substring(2);
		System.out.println("3: SubString : "+sname);
		sname = sname.substring(2, 5);
		System.out.println("4: SubString : "+sname);
		
		String sChange = "hyonny%love";
		System.out.print("5: main:before: ");
		System.out.println("Hot Live : "+sChange);
		changeIn(sChange);
		System.out.print("7: main:after: ");
		System.out.println("Hot Live :"+sChange);
	}
	
	public static void changeIn(String str){
		str = str.replace('o', 'z');
		str += "Hello";
		System.out.println("6: method changeIn : Heart"+str);
	}
	
	public static boolean hasDelemeter(char c){
		boolean hasD = false;
		if(",<>/%^&*-=()".indexOf(c) != -1){
			hasD = true;
		}
		return hasD;
	}
}
