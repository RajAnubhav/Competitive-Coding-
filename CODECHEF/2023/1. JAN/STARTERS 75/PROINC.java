import java.util.Scanner;

public class PROINC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            int bp = Math.abs(x-y);
            int np = (int)(x*(1.1));
            System.out.println(np-bp);
        }
        sc.close();
    }    
}
