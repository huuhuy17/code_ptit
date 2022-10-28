import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = findSum(arr, n);
		
		while(isFull(arr, n)) {
			fillRow(arr, n, sum);
			fillCol(arr, n, sum);
			fillX(arr, n, sum);
			fillXR(arr, n, sum);
		}
		show(arr,n);
		sc.close();
	}
	static boolean isFull(int arr[][], int n) {
		boolean zero = false;
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				if(arr[i][j] == 0) {
					zero = true;
				};
			}
		}
		return zero;
	}
	static void fillRow(int arr[][], int n, int sum) {
		for(int i = 0; i < n; i++) {
			int check_sum = 0;
			int dem = 0;
			for (int j = 0; j < n ;j++) {
				if(arr[i][j] > 0) {
					check_sum += arr[i][j];
					dem++;
				}
				
			}
			if (dem == n - 1) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == 0) {
						arr[i][j] = sum - check_sum;
					}
				}
			}
		}
	}
	
	static void fillCol(int arr[][], int n, int sum) {
		for(int i = 0; i < n; i++) {
			int check_sum = 0;
			int dem = 0;
			for (int j = 0; j < n ;j++) {
				if(arr[j][i] > 0) {
					check_sum += arr[j][i];
					dem++;
				}
				
			}
			if (dem == n - 1) {
				for(int j = 0; j < n; j++) {
					if(arr[j][i] == 0) {
						arr[j][i] = sum - check_sum;
					}
				}
			}
		}
	}
	static void fillX(int arr[][], int n, int sum) {
		int check_sum = 0, dem = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==j && arr[i][j] > 0) {
					check_sum += arr[i][j];
					dem++;
				}
			}
		}
		if(dem == n - 1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j && arr[i][j] == 0) {
						arr[i][j] = sum - check_sum;
					}
				}
			}
		}
	}
	static void fillXR(int arr[][], int n, int sum) {
		int check_sum = 0, dem = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i== n - 1 -j && arr[i][j] > 0) {
					check_sum += arr[i][j];
					dem++;
				}
			}
		}
		
		if(dem == n - 1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == n - 1 - j && arr[i][j] == 0) {
						arr[i][j] = sum - check_sum;
					}
				}
			}
		}
	}
	static int findSum(int arr[][], int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int check = 0;
			for(int j = 0; j < n; j++) {
				if(arr[i][j] > 0) {
					sum += arr[i][j];
					check++;
				}
			}
			if(check == n) break;
			else sum = 0;
		}
		if(sum == 0) {
			for(int i = 0; i < n; i++) {
				int check = 0;
				for(int j = 0; j < n; j++) {
					if(arr[j][i] > 0) {
						sum += arr[j][i];
						check++;
					}
				}
				if(check == n) break;
				else sum = 0;
			}
		}
		if(sum == 0) {
			int check = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j && arr[i][j] > 0) {
						sum += arr[i][j];
						check++;
					}
				}
			}
			if(check < n) sum = 0;
		}
		if(sum == 0) {
			int check = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == n - 1 - j && arr[i][j] > 0) {
						sum += arr[i][j];
						check++;
					}
				}
				if(check == n) break;
			}
		}
		return sum;
	}
	
	static void show(int arr[][], int n) {
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
