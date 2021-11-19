import java.util.Scanner;

public class KhaiBaoLopSinhVien {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String class1 = in.nextLine(); 
        String birth = in.nextLine();
        float GPA = in.nextFloat();
        SinhVien1 sv = new SinhVien1(name, class1, birth, GPA);
        sv.checkBirth(birth);
        System.out.println(sv);
        in.close();
    }

    static class SinhVien1{
        String Code;
        String name;
        String class1;
        String birth;
        float GPA;

        public SinhVien1(String name, String class1, String birth, float GPA) {
            this.Code = "B20DCCN001";
            this.name = name;
            this.class1 = class1;
            this.birth = birth;
            this.GPA = GPA;
        }
        public void checkBirth(String birth){
            if(birth.length() == 10)
                return ;
            String s[] = birth.split("/");
            if(s[0].length() != 2 )
                s[0] = "0" + s[0];
            if(s[1].length() != 2)
                s[1] = "0" + s[1];
            if(s[1].compareTo("12")>=1){
                String temp = s[0];
                s[0] = s[1];
                s[1] = temp;
            }
            this.birth = s[0] + "/" + s[1] + "/" + s[2];
        }
        public String toString() {
            return  this.Code + " " + this.name + " " + this.class1  + " " + this.birth+ " " + String.format("%.2f", this.GPA);   
        }   
    }
}