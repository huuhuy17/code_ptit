import java.util.Scanner;
import java.util.Vector;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        Vector <String> v = new Vector<>();
        while(i <= n){
            String res = "List(" + i + ") = ";
            int j = 1; 
            while(j <= n){
                int temp = in.nextInt();
                if(temp == 1) res += (j + " ");
                j++;
            }
            i++;
            v.add(res);
        }
        for(int j = 0; j < v.size(); j++){
            System.out.println(v.elementAt(j));
        }
        in.close();
    }   
}
