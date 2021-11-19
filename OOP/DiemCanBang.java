import java.util.Scanner;
public class DiemCanBang {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum+=a[i];
            }
            int kq = -2;
            int sumleft=a[0];
            for (int i = 1; i < n-1; i++) {
                if(sumleft == sum - sumleft - a[i]){
                    kq = i;
                    break;
                }
                else sumleft += a[i];
            }
            System.out.println(kq + 1);
        }
        scanner.close();
    }
}