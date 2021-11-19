
import java.util.Scanner;
import java.util.Vector;

public class DiaChiEmail {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            int j = 0;
            String[] res = new String[t];
            while (t-- > 0) {
                String[] st = sc.nextLine().split("\\s+");
                Vector<String> arr = new Vector<String>();
                String tmp = "";
                for (int i = 0; i < st.length; i++) {
                    if (st[i].trim().length() > 0) {
                        tmp = st[i].toLowerCase();
                        arr.add(tmp);
                    }
                }
                String x = "";
                x += arr.get(arr.size() - 1);
                for (int i = 0; i < arr.size() - 1; i++) {
                    x += arr.get(i).substring(0,1);
                }
                int soLanXuatHien = 1;
                for(int i = 0; i<j;i++){
                    if(x.equals(res[i])){
                        soLanXuatHien++;
                    }
                }
                if( soLanXuatHien > 1) {
                    System.out.println(x + String.valueOf(soLanXuatHien) + "@ptit.edu.vn");
                }
                else {
                    System.out.println(x + "@ptit.edu.vn");
                }
                res[j] = x;
                j++;
                
            }
        }
    }
}