import java.util.Scanner;

public class HUY_SMPCPH1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s1 = sc.nextLine();
		int m = Integer.parseInt(sc.nextLine());
		String[] s2 = new String[100];
		for(int i = 0; i<m; i++) {
			s2[i] = sc.nextLine();
			char[] s = s2[i].toCharArray();
			for(int k = 0; k < s.length;k++)
				for(int j = 0; j < n; j++) {
					if(s[k] == s1.charAt(j)) {
						s[k] = (char) (j + '0');
					}
				}
			
			for(int k = 0; k<s.length; k++) {
				if(s[k] >= '0' && s[k] - '0'< n - 1) {
					s[k] = s1.charAt(s[k] - '0' + 1);
				}
				if(s[k] >= '0' && s[k] - '0' == n -1) {
					s[k] = s1.charAt(0);
				}
			}
			
			System.out.println(s);
		}
		sc.close();
	}
}
