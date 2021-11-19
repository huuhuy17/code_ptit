import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String sex = in.nextLine(); 
        String birth = in.nextLine();
        String address = in.nextLine();
        String taxNums = in.nextLine();
        String signContract = in.nextLine();
        NhanVien nv = new NhanVien(name, sex, birth, address, taxNums, signContract);
        System.out.println(nv);
        in.close();
    }

    static class NhanVien{
        String Code;
        String name;
        String sex;
        String birth;
        String address;
        String taxNums;
        String signContract;

        public NhanVien(String name, String sex, String birth, String address, String taxNums, String signContract) {
            this.Code = "00001";
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.address = address;
            this.taxNums = taxNums;
            this.signContract = signContract;
        }
        public String toString() {
            return  Code + " " + name + " " + sex  + " " + birth+ " " + 
                    address + " " + taxNums + " " + signContract;
        }   
    }
}
