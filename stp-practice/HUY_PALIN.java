import java.util.Scanner;

public class HUY_PALIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			StringBuilder n = new StringBuilder(s);
			int len = n.length();
			if(checkIsAllNine(n)) {
				System.out.print(1);
				for(int i = 0; i < n.length() - 1; i++) {
					System.out.print(0);
				}
				System.out.println(1);
				continue;
			}
			if(checkIsAllZero(n)) {
				System.out.print(1);
				for(int i = 0; i < n.length() - 2; i++) {
					System.out.print(0);
				}
				System.out.println(1);
				continue;
			}
			int left = n.length() / 2, right = n.length() / 2;
			if(len % 2 == 0) {
				left--;
			}
			while(n.charAt(left) == n.charAt(right) || left >= 0 ) {
				left--;right++;
				if(left < 0) break;
			}
			if(left < 0 || n.charAt(left) < n.charAt(right)) {
				left = right = len / 2;
				if(len % 2 == 0) {
					left--;
				}
				int carry = 1;
				while(left >= 0) {
					int num = n.charAt(left) - '0' + carry;
					carry = num / 10;
					n.setCharAt(left, (char) (num % 10 + '0'));
					n.setCharAt(right, n.charAt(left));
					left--; right++;
				}
			}
			else {
				while(left >= 0) {
					n.setCharAt(right, n.charAt(left));
					left--; right++;
				}
			}
			System.out.println(n);
		}
		sc.close();
	}
	static boolean checkIsAllNine(StringBuilder n) {
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i) != '9') {
				return false;
			}
		}
		return true;
	}
	static boolean checkIsAllZero(StringBuilder n) {
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i) != '0') {
				return false;
			}
		}
		return true;
	}
}
