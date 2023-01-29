import java.util.*;
public class CHEFRACES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, a, b;
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if((a==x && b==y) || (a==y && b==x))
                System.out.println(0);
            else if((a!=x && b!=y))
                System.out.println(2);
            else
                System.out.println(1);
        }
        sc.close();
    }
}