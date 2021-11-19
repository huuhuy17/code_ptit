import java.util.Scanner;
public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            t--;
            long n = ip.nextLong();
            String s = ip.next();
            long a = 0;
            for(int i = 0; i < s.length(); i++){
                a = a*10 + (s.codePointAt(i) - '0');
                if(a > n){
                    a%=n;
                }
            }
            System.out.println(GCD(a,n));
        }
        ip.close();
    }
    public static long GCD(long a, long b){
        if(b == 0) return a;
        else return GCD(b, a%b);
    }
}
