import java.util.Scanner;

public class HUY_MDIGITS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String s = "";
		for(int i = 1; i<=Integer.parseInt(n); i++) {
			s += String.valueOf(i);
		}
		System.out.println(s.indexOf(n) + 1);
		sc.close();
	}
}
