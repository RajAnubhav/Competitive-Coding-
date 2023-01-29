import java.util.*;
public class BATH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x<2*y)
                System.out.println(0);
            else
                System.out.println(x/(2*y));
        }
        sc.close();
    }
}
