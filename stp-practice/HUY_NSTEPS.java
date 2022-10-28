import java.util.Scanner;

public class HUY_NSTEPS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(proc(x, y));
		}
		sc.close();
	}
	static String proc(int x, int y) {
		if(x == y) {
			if(x % 2 == 0) {
				return x * 2 + "";
			}
			else return x * 2 -1 + "";
		}
		else if (x - y == 2) {
			if (x % 2 == 0) {
				return x + y + "";
			}
			else return x + y -1 + "";
		}
		return "No Number";
	}
}
