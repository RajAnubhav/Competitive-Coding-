import java.util.Scanner;

public class CHEFCONTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, p, q;
            x = sc.nextInt();
            y = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            if((x+p*10)<(y+q*10))
                System.out.println("CHEF");
            else if((x+p*10)>(y+q*10))
                System.out.println("CHEFINA");
            else 
                System.out.println("DRAW");
        }
        sc.close();
    }
}
