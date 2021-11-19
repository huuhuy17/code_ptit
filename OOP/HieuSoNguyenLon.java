import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String a = in.next();
            String b = in.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            String s = A.subtract(B).abs().toString();
            if(s.length()<Math.max(a.length(), b.length())){
                int delen = Math.abs(Math.max(a.length(), b.length())-s.length());
                String str = "";
                for(int i=0; i<delen; ++i){
                    str += "0";
                }
                s = str+s;
            }
            System.out.println(s);
        }
        in.close();
    }
}
