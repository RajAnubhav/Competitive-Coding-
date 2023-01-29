import java.util.Scanner;

public class EITA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int d, x, y, z;
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            int weekly = x*7;
            int todo = d*y+(7-d)*z;
            System.out.println(Math.max(todo, weekly));
        }
        sc.close();
    }
}
