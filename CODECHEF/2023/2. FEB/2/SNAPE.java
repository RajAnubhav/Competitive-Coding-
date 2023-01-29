import java.util.Scanner;

public class SNAPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int b, ls;
            b = sc.nextInt();
            ls = sc.nextInt();
            float rs_min,  rs_max;
            rs_min = (float)Math.sqrt(Math.pow(ls, 2)-Math.pow(b, 2));
            rs_max = (float)Math.sqrt(Math.pow(ls, 2)+Math.pow(b, 2));
            System.out.format("%.2f %.2f\n", rs_min, rs_max);
        }
        sc.close();
    }
}
