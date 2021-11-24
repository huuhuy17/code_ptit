import java.util.Scanner;
import java.util.StringTokenizer;
public class DaoTu {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(in.nextLine());
            while(st.hasMoreTokens()){
                String s= st.nextToken();
                for(int i=s.length()-1;i>=0;i--){
                    System.out.print(s.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
    }
}