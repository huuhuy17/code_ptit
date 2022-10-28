import java.util.Scanner;

public class HUY_REPROAD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i< n; i++) {
				a[i] = sc.nextInt();
			}
			int front = 0, back = 0;
			int max_len = 0, zeros = 0;
			
			while(back < n) {
				if (a[back] == 0) zeros++;
				if(zeros <= k) {
					max_len = Math.max(max_len, back - front + 1);
				}
				else {
					while(zeros > k && front < back) {
						if(a[front] == 0) {
							zeros--;
						}
						front++;
					}
				}
				back++;
			}
			System.out.println(max_len);
		}
		sc.close();
	}
}
