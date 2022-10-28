import java.util.Scanner;

public class HUY_DNEQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			Float n = sc.nextFloat();
			Float a = sc.nextFloat();
			Float b = sc.nextFloat();
			System.out.printf("%.0f", n * a + b);
		}
		sc.close();
	}
}
