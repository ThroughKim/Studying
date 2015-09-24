package book;
import java.util.*;

public class PrintfTest {
	public static void main(String[] args){
		int a = 20;
		long b = 30000L;
		float c = 34.98F;
		double d = 234.234;
		char e = 'k';
		Calendar today = Calendar.getInstance();
		
		System.out.println(a+ " , " +b+ " , " +c+ " , " +d+ " , " +e);
		System.out.printf("\\ %% %d %d %f %f %c %n",a,b,c,d,e);
		System.out.printf("%1$d %1$d %2$c\n",a,97 );
		System.out.printf("%1$h %1$o %1$x\n",a);
		System.out.printf("%f %1$a %1$e %1$f %1$g\n",65.8734543537);
		
		System.out.printf("Today %1$tm %1$te %1$tY %n", today);
		System.out.printf("Today %1$tm %1$td %1$ty %n", today);
		System.out.printf("Today %1$th %1$tI, %1$ta %n", today);
		
		System.out.printf("12312443453235252341412412412\n");
		
		System.out.printf("%1$20f\n",5678.3435453535);
		System.out.printf("%1$20.10f\n",5678.3435453535);
		System.out.printf("%1$-20.10f\n",5678.3435453535);
		
	}
}
