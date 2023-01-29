import java.util.*;
public class PASSORFAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x, p;
            n = sc.nextInt();
            x = sc.nextInt();
            p = sc.nextInt();
            if(((x*3)-(n-x))>=p)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        sc.close();
    }
}