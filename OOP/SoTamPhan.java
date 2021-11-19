import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            boolean ok =true;
            while(n!=0){
                int temp = n%10;
                n/=10;
                if(temp<0 || temp>2){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
