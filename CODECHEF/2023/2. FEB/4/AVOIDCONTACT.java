import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class AVOIDCONTACT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt(); // total 
            y = sc.nextInt(); // infected
            if(x==y)
                System.out.println(y*2-1);
            else 
                System.out.println(x+y);
            
        }
        sc.close();
    }
}
