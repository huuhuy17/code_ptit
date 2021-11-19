import java.math.BigInteger;
import java.util.Scanner;

public class HieuHaiSoNguyenLon_2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            System.out.println(a.subtract(b));
        ip.close();
    }
}
