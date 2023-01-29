import java.util.Scanner;

public class CHFPROFIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println(Math.abs((x*y)-(x*z)));
        }
        sc.close();
    }
}
