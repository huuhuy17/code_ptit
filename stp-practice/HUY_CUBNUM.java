import java.util.Scanner;

public class HUY_CUBNUM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int t = 1;
		while(true) {
			s = sc.nextLine();
			if(s == "EOF") break;
			else {
				int n = Integer.parseInt(s);
				System.out.println("Case #" + t + ": " + progress(n));
			}
			t++;
		}
		sc.close();
	}
	static int progress(int n) {
		int count = 0;
		for(int i = (int) Math.cbrt(n); i >= 0; i--) {
			int m = n;
			while (m >= Math.pow(i, 3)) {
				m -= Math.pow(i, 3);
				count++;
			}
			if (m == 0) break;
		}
		return count;
	}
}
