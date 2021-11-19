import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HinhSao {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        Map <Integer, Integer>  map = new HashMap<>();
        while(m > 1){
            m--;
            int a = in.nextInt();
            int b = in.nextInt();
            if(map.containsKey(a)){
                map.replace(a, map.get(a)+1);
            }
            else{
                map.put(a, 1);
            }
            if(map.containsKey(b)){
                map.replace(b, map.get(b)+1);
            }
            else{
                map.put(b, 1);
            }
        }
        int dem = 0;
        Set<Integer> set = map.keySet();
        for(Integer key : set){
            if(map.get(key) != 1 && map.get(key) != n-1){
                System.out.println("No");
                break;
            }
            if(map.get(key) == n-1){
                if(dem == 0)
                    dem = 1;
                else{
                    System.out.println("No");
                    break;
                }
            }
        }
        if(dem == 1){
            System.out.println("Yes");
        }
        in.close();
    }
}
