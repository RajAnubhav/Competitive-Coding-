import java.util.Scanner;

public class CHEFVACATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(z>=(x+y))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
