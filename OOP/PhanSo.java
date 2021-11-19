import java.util.Scanner;
public class PhanSo {
    public static long gcd(long a, long b){
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong(), b = in.nextLong();
        System.out.println(a/gcd(a, b)+"/"+b/gcd(a, b));
        in.close();
    }
}
