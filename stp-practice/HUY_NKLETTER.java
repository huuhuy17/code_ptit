import java.util.Scanner;

public class HUY_NKLETTER {
	static String Sb, Se;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sb = sc.nextLine();
		Se = sc.nextLine();
		int lenB = Sb.length();
		int lenE = Se.length();
		System.out.println(lenB);
		for(int i = 0; i < lenB; i++) {
			if (Sb.substring(i, lenB).equals(Se.substring(0, lenB-i))) {
				System.out.println(i);
				System.out.println(Se.subSequence(0,  lenB - i));
				System.out.println(i + lenE - (lenB - i));
				break;
			}
		}
		sc.close();
	}
}
