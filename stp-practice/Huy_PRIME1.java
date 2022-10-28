import java.util.Scanner;

public class Huy_PRIME1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n-- > 0) {
			int a,b; 
			a = sc.nextInt();
			b = sc.nextInt();
			for(int i = a; i<=b; i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
	static boolean isPrime(int n) {
		if (n<2) return false;
		for (int i = 2; i*i <= n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
