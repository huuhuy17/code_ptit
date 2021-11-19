import java.util.Scanner;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String s1, s2;
        int len;
        while(t > 0){
            t--;
            s1 = ip.next();
            s2 = ip.next();
            if(s1.compareTo(s2) != 0){
                if(s1.length() > s2.length())
                    len = s1.length();
                else
                    len = s2.length();
                System.out.println(len);
            }
            else
                System.out.println(-1);
        }
        ip.close();
    }
}
