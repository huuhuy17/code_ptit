import java.util.*;


public class TimSoDu {
    // public static boolean ChiaHet3(String s){
    //     int sum = 0;
    //     for(int i = 0;i<s.length();i++){
    //         sum += Integer.parseInt(String.valueOf(s.charAt(i)));
    //     }
    //     if(sum%3==0)
    //     return true;
    //     else return false;
    // }
    public static void ChiaHet4(String s){
        int tmp = Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10 + Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
        System.out.println(tmp);
        if(tmp%4==0) System.out.println(4);
        else System.out.println(0);;
    }
    // public static boolean ChiaHet2(String s){
    //     if(Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))%2==0){
    //         return true;
    //     }
    //     else return false;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String s = sc.nextLine();
            int tmp = Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10 + Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
            if(tmp%4==0){
                System.out.println("4");
            }
            else System.out.println("0");
            
            
            // if(ChiaHet4(s)==true){
            //     System.out.println(4);
            // }
            // else System.out.println(0);
        }
        sc.close();
    }
}
