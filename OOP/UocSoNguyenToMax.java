import java.util.Scanner;
import java.lang.Math;
public class UocSoNguyenToMax {
    public static boolean nT(long n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            long max = 0;
                for (long i = 1; i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        if(nT(n/i)) max = n/i;
                        else if(nT(i)) max = i;
                    }
                }
                System.out.println(max);
            
            t--;
        }
        scanner.close();
    }
}
