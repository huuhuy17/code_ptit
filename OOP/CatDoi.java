import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            solution(s);
        }
        in.close();
    }
    static void solution(String s){
        int len = s.length();
        StringBuilder res = new StringBuilder();
        boolean ok = true;
        boolean all_0 = true;
        for(int i = 0; i < len; i++){
            if (s.charAt(i) == '1') {
                res.append("1");
                all_0 = false;
            } else if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                if(!all_0)
                    res.append("0");
            } else {
                ok = false;
                break;
            }
        }
        if(all_0) System.out.println("INVALID");
        else if(ok) System.out.println(res);
        else System.out.println("INVALID");
    }
}