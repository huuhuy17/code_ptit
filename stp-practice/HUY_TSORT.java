import java.util.Scanner;

public class HUY_TSORT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		for(int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < t-1; i++) {
			for(int j = i+1; j < t; j++) {
				if(a[i] > a[j]) {
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		for(int i = 0; i < t; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
