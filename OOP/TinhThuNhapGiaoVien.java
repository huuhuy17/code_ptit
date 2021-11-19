import java.util.Scanner;

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String ma = in.nextLine();
        String ten = in.nextLine();
        int luong = in.nextInt();
        GV g = new GV(ma.toUpperCase(), ten, luong);
        System.out.println(g);
        in.close();
    }
    static class GV{
        private String ma;
        private String ten;
        private int luong;
        public GV(){
            this.ma = null;
            this.ten = null;
            this.luong = 0;
        }
        public GV(String ma, String ten, int luong){
            this.ma = ma;
            this.ten = ten;
            this.luong = luong;
        }
        public int tinhPhuCap(){
            String chucvu = ma.substring(0,2);
            int phucap =0;
            if(chucvu.equals("HT"))
                phucap = 2000000;
            else if (chucvu.equals("HP"))
                phucap = 900000;
            else
                phucap = 500000;
            return phucap;
        }
        public int heSo(){
            String bacluong = ma.substring(2,4);
            return Integer.parseInt(bacluong);

        }
        public String toString() {
            int heso = heSo();
            int phucap = tinhPhuCap();
            return ma +" "+ ten +" "+ heso+" "+phucap
                +" "+((heso * luong) + phucap);
        }
    }
}
