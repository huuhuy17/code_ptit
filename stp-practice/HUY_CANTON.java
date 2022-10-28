import java.util.Scanner;

public class HUY_CANTON {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			int N = findN(n);
			int S = findS(n);
			int a[][] = new int[N+2][N+2];
			int d = 1, i = 1, j = 1;
			a[i][j++] = d++;
			while(d < S) {
				while(j >= 1) {
					a[i++][j--] = d++;
				}
				j = 1; 
				while(i >= 1) {
					a[i--][j++] = d++;
				}
				i = 1;
			}
			for(int x = 1; x <= N; x++) {
				for(int y = 1; y <= N; y++) {
					if(a[x][y] == n) {
						System.out.println("TERM " + n + " IS " + x + "/" + y);
						break;
					}				
				}
			}
		}
		sc.close();
	}
	static int findN(int n) {
		int sum = 0, i = 1;
		while(sum < n) {
			sum += i++;
		}
		return i-1;
	}
	
	static int findS(int n) {
		int sum = 0, i = 1;
		while(sum < n) {
			sum += i++;
		}
		return sum;
	}
	static void show(int arr[][], int n) {
		for(int i = 1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
