import java.util.Scanner;

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        TamGiac tr[] = new TamGiac[t];
        for(int i =0; i< t; i++){
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();
            while(x1>1000||x2>1000||x3>1000||y1>1000||y2>1000||y3>1000){
                 x1 = in.nextDouble();
                 y1 = in.nextDouble();
                 x2 = in.nextDouble();
                 y2 = in.nextDouble();
                 x3 = in.nextDouble();
                 y3 = in.nextDouble();
            }
            tr[i] = new TamGiac(x1,y1,x2,y2,x3,y3);
            if(tr[i].check())
                System.out.format("%.3f%n",tr[i].tinhChuVi());
            else 
                System.out.println("INVALID");
        }
        in.close();
    }
    static class TamGiac{
        private double x1;
        private double y1;
        private double x2;
        private double y2;
        private double x3;
        private double y3;
        public TamGiac(double x1, double y1, double x2, double y2, double x3, double y3){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }
        public double distance(double x1, double y1, double x2, double y2){
            double kc = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
            return kc;
        }
        public boolean check(){
            double canh1 = distance(x1, y1, x2, y2);
            double canh2 = distance(x2, y2, x3, y3);
            double canh3 = distance(x3, y3, x1, y1);
            boolean ok = false;
            if((canh1 + canh2 > canh3)&&(canh1 + canh3 > canh2)&&(canh2 + canh3 > canh1))
                ok = true;
            return ok;
        }
        public double tinhChuVi(){
            double canh1= distance(x1, y1, x2, y2);
            double canh2 = distance(x2, y2, x3, y3);
            double canh3 = distance(x3, y3, x1, y1);
            return canh1+canh2+canh3;
        }
    }
}
