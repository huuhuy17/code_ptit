import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            t--;
            int n = ip.nextInt();
            double h = ip.nextDouble();
            for(int i = 1; i < n; i++){
                System.out.format("%.6f", h*Math.sqrt((double)i/n));
                System.out.print(" ");
            }
            System.out.println();
        }
        ip.close();
    }
}
