import java.util.Scanner;

public class KhaiBaoHinhChuNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String color = in.next();
        if(a <= 0 || b <= 0)
            System.out.println("INVALID");
        else{
            Rectangle r = new Rectangle(a, b, color);
            System.out.println(r.toString());
        }
        in.close();
    }

    static class Rectangle{
        int width;
        int height;
        String color;
        public Rectangle() {
            this.width = 1;
            this.height = 1;
        }
        public Rectangle(int width, int height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }
        public String getColor() {
            color = color.toLowerCase();
            char c = color.charAt(0);
            c = (char)(c-32);
            return (c + color.substring(1));
        }

        public String toString() {
            return ((this.width + this.height)*2) + " " + (this.width * this.height) + " " + getColor();
        }
    }
}
