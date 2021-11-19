import java.util.Scanner;

public class DienThoaiCucGach {
    public static int check(char c){
        if(c - 'A' <= 2)
            return 2;
        if(c-'A' >= 3 && c - 'A' <= 5)
            return 3;
        if(c-'A' >= 6 && c - 'A' <= 8)
            return 4;
        if(c-'A' >= 9 && c - 'A' <= 11)
            return 5;
        if(c-'A' >= 12 && c - 'A' <= 14)
            return 6;
        if(c-'A' >= 15 && c - 'A' <= 18)
            return 7;
        if(c-'A' >= 19 && c - 'A' <= 21)
            return 8;
        return 9;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            t--;
            String s = in.next();
            s = s.toUpperCase();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                res += check(s.charAt(i));
            }
            StringBuilder tmp = new StringBuilder(res);
            if(res.equals(tmp.reverse().toString()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
