import java.util.Scanner;

public class SoXaCach {
    static int n, a[], ok[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            t--;
            n = in.nextInt();
            a = new int[n+1];
            ok = new int[n+1];
            init();
            solution(1);
        }
        in.close();
    }
    public static void init(){
        for(int i = 1; i <= n; i++){
            ok[i] = 0;
        }
    }
    public static void solution(int k){
        for(int i = 1; i <= n; i++){
            if(ok[i] == 0){
                ok[i] = 1;
                a[k] = i;
                if(k == n) {
                    if(check()){
                        for(int j = 1; j <= n; j++){
                            System.out.print(a[j]);
                        }
                        System.out.println();
                    }
                }
                else solution(k+1);
                ok[i] = 0;
            }
        }
    }
    public static boolean check(){
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i] - a[i-1]) == 1)
                return false;
        }
        return true;
    }
}
