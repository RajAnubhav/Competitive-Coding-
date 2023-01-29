import java.util.*;
public class AORB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            // after q1 he will solve q2
            System.out.println((500-x*2)+(1000-(x+y)*4));
        }
        sc.close();
    }
}