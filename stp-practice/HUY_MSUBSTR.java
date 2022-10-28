import java.util.Scanner;

public class HUY_MSUBSTR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			int len = s.length();
			int len_sub = len;
			int count = 0;
			boolean finish = false;
			while(true) {
				count = 0;
				finish = false;
				for(int i = 0; i < len; i++) {
					if (i + len_sub > len) {
						break;
					}
					if (len_sub == 1 || (len_sub == 2 && s.charAt(i) == s.charAt(i+1))) {
						count++;
						finish = true;
					}
					else {
						boolean check = true;
						for(int j = 0; j <= (len_sub - 1) / 2; j++) {
							if(s.charAt(i + j) != s.charAt(len_sub - 1 - j + i)) {
								check = false;
								break;
							}
						}
						if(check == true) {
							count++;
							finish = true;
						}
					}
				}
				if (finish == true) {
					break;
				}
				if (len_sub == 1) break;
				len_sub--;
			}
			System.out.println(len_sub + " " + count);
		}
		sc.close();
	}
}
