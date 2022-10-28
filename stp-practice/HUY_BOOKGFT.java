import java.util.Scanner;

public class HUY_BOOKGFT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(n%m==0) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		sc.close();	}
}
