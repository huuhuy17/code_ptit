import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Huy_ADDREV {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int tc = Integer.parseInt(stringTokenizer.nextToken());
		while (tc > 0) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int a = Integer.parseInt(stringTokenizer.nextToken());
			int b = Integer.parseInt(stringTokenizer.nextToken());

			String num1 = a + "";
			String num2 = b + "";
			char[] cNum1 = num1.toCharArray();
			char[] cNum2 = num2.toCharArray();
			cNum1 = reverse(cNum1);
			cNum2 = reverse(cNum2);
			num1 = String.valueOf(cNum1);
			num2 = String.valueOf(cNum2);
			int res = Integer.parseInt(num1) + Integer.parseInt(num2);
			while (res % 10 == 0) {
				res /= 10;
			}
			String str = res + "";
			char[] cRes = str.toCharArray();
			cRes = reverse(cRes);
			System.out.println(cRes);
			tc--;
		}
	}

	static char[] reverse(char[] num) {
		int n = num.length;
		char[] res = new char[n];
		for (int i = 0; i < n; i++) {
			res[i] = num[n - 1 - i];
		}
		return res;
	}
}