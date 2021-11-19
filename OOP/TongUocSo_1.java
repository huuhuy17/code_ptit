import java.util.Scanner;

public class TongUocSo_1 {
    private static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int n = ip.nextInt();
        long temp = 0;
        int[] a = new int[n];
        int t = 0;
        for(int i = 0; i < n; i++){
            a[i] = ip.nextInt();
            if(a[i] > t) t = a[i];
        }
        int[] b = new int[t+1];
        for(int i = 2; i<=Math.sqrt(t); i++){
            if(b[i] == 0){
                for(int j=i*2; j<=t; j+=i)
                    b[j] = i;
            }
        }
        for(int i=0; i<n; i++){
            while(a[i] > 1){
                int x = b[a[i]];
                if(x == 0){
                    temp+=a[i];
                    break;
                }
                while(a[i]>1 && a[i]%x==0){
                    a[i] /= x;
                    temp+=x;
                }
            }
        }
        System.out.println(temp);
    }
}
