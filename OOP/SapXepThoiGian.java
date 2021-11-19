import java.util.Arrays;
import java.util.Scanner;

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SXTG a[] = new SXTG[n];
        for(int i = 0; i < n; i++){
            int hours = in.nextInt();
            int mins = in.nextInt();
            int secs = in.nextInt();
            a[i] = new SXTG(hours, mins, secs);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
        in.close();
    }
    
    static class SXTG implements Comparable<SXTG>{
        private int hours;
        private int mins;
        private int secs;

        public SXTG() {
            
        }
        public SXTG(int hours, int mins, int secs) {
            this.hours = hours;
            this.mins = mins;
            this.secs = secs;
        }
        public int compareTo(SapXepThoiGian.SXTG s) {
            int tmp1 = this.hours*3600 + this.mins* 60 + this.secs;
            int tmp2 = s.hours*3600 + s.mins* 60 + s.secs;
            if(tmp1 == tmp2)
                return 0;
            else if(tmp1 > tmp2)
                return 1;
            return -1;
        }
        public String toString() {
            return this.hours + " " + this.mins + " " + this.secs;
        }
    }
}
