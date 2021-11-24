import java.math.BigInteger;
import java.util.Scanner;
public class BoiSoChungNhoNhat{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(in.next(),10);
            BigInteger b =new BigInteger(in.next(),10);
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
        in.close(); 
    }
}