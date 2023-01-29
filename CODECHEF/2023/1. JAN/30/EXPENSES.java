import java.util.*;
public class EXPENSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            if(Math.abs(n-x)==1)
                System.out.println(2);
            else
                System.out.println(n+x);
        }
        sc.close();
    }
}