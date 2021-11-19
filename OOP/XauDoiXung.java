import java.util.Scanner;
public class XauDoiXung {
    public static int kt(String a){
        int dem = 0;
        int dau = 0;
        int cuoi = a.length()-1;
        while(dau<cuoi){
            if(a.charAt(dau)!=a.charAt(cuoi)) dem++;
            dau++;
            cuoi--;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            String a = scanner.next();
            if(kt(a) == 0){
                if(a.length()%2==0) System.out.println("NO");
                else System.out.println("YES");
            }
            else if(kt(a)==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        scanner.close();
    }
}
