import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test > 0){
            test--;
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();
            coordinates p1 = new coordinates(a,b);
            coordinates p2 = new coordinates(c,d);
            System.out.format("%.4f\n", coordinates.distance(p1, p2));
        }
        in.close();
    }   
    static class coordinates{
        double x;
        double y;
        public coordinates(){

        }
        public coordinates(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double distance(coordinates p){
            return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
        }
        public static double distance(coordinates p1,coordinates p2){
            return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
        }
    }
}
