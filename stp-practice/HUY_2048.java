import java.util.Scanner;

public class HUY_2048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i<n;i++)
				a[i] = sc.nextInt();
			
			boolean check = true;
			int len = a.length;
			int max = 0;
			while(check) {
				boolean c = false;
				for(int i = 0; i<len-1; i++) {
					if(a[i] == a[i+1]) {
						 c = true;
						 break;
					}
				}
				check = c;
				for(int i = 0; i < len - 1; i++) {
					if(a[i] == a[i+1]) {
						a[i] = a[i] * 2;
						for(int j = i+1; j< len - 1;j++) {
							a[j] = a[j+1];
						}
						len--;
						break;
					}
				}
				for(int i = 0; i<len;i++) {
					if(a[i] > max) max = a[i];
				}
			}
			System.out.println(max);
				
		}
		sc.close();
	}
}
