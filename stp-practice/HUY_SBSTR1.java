import java.math.BigInteger;
import java.util.Scanner;

public class HUY_SBSTR1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		int m = sc.nextInt();
		String a = String.valueOf(n);
		String b = String.valueOf(m);
		if(a.indexOf(b) >= 0) {
			System.out.println(1);
		}
		else System.out.println(0);
		sc.close();
	}
}
