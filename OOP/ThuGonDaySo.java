import java.util.Scanner;
import java.util.Vector;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Vector<Integer> v = new Vector<>(n);
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            v.add(x);
        }
        int size = v.size();
        for(int i = 0; i < size-1;){
            if((v.get(i)+v.get(i+1))%2==0){
                v.remove(i);
                v.remove(i);
                if(i>0) i--;
                size-=2;
            }
            else i++;
        }
        System.out.println(size);
        in.close();
    }
}
