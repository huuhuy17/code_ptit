import java.util.Scanner;

public class XauNhiPhan {
    static long k, f[];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        f = new long[94];
        f[1] = 1; f[2]= 1;
        for(int i = 2; i < 93; i++){
            f[i] = f[i-1] + f[i-2];
        }
        while(t > 0){
            t--;
            n = in.nextInt();
            k = in.nextLong();
            System.out.println(solution(n, k));
        }
        in.close();
    }
    public static int solution(int a, long k){
        if(a == 1) return 0;
        if(a == 2) return 1;
        if(k <= f[a-2]) return solution(a-2, k);
        return solution(a-1, k - f[a-2] );
    }
}
