import java.util.*;
public class LuyThua {
    public static long M = (int)(1E9+7);
    public static long pow(long a,long b){
        if(b==0) return 1;
        long n = pow(a,b/2);
        if(b%2==0) return n*n%M;
        return n*n%M*a%M;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 20;
        while(t-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0&&b==0) break;
            System.out.println(pow(a,b));
        }
        scanner.close();
    }
}