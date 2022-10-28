import java.util.Scanner;

public class HUY_TOANDFRO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		char[][] a = new char[arr.length / n][n];
//		int k = 0;
//		for (int i = 0; i < n; i++) {
//			for(int j = 0; j < arr.length / n; j++) {
//				a[i][j] = arr[k++]; 
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			for(int j = 0; j < arr.length / n; j++) {
//				System.out.print(String.format("%s ", a[i]));
//			}
//			System.out.println();
//		}
		sc.close();
	}
}
