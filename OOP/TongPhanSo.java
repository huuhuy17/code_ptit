import java.util.Scanner;

public class TongPhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        PhanSo p = new PhanSo(a,b);
        PhanSo q = new PhanSo(c,d);
        System.out.println(PhanSo.add(p, q));
        in.close();
    }
    static class PhanSo{
        Scanner in = new Scanner(System.in);
        private long tuSo;
        private long mauSo;

        public PhanSo(){
            this.tuSo = 0;
            this.mauSo = 1;
        }
        public PhanSo(long tuSo, long mauSo){
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
        public void nhap(){
            this.tuSo = in.nextLong();
            this.mauSo = in.nextLong();
        }
        public long UCLN(long a, long b){
            while(b != 0){
                long temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
        public void rutGon(){
            long ucln = UCLN(this.tuSo, this.mauSo);
            this.tuSo /= ucln;
            this.mauSo /= ucln;
        }

        public static PhanSo add(PhanSo a, PhanSo b){
            PhanSo c = new PhanSo(a.tuSo* b.mauSo + b.tuSo*a.mauSo , a.mauSo*b.mauSo);
            c.rutGon();
            return c;
        }

        public String toString(){
            return this.tuSo + "/" + this.mauSo;
        }
    }
}

