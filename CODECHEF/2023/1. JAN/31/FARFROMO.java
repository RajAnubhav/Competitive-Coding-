import java.util.Scanner;

public class FARFROMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1, y1, x2, y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(Math.sqrt(x1*x1+y1*y1)>Math.sqrt(x2*x2+y2*y2))
                System.out.println("ALICE");
            else if(Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2))
                System.out.println("BOB");
            else 
                System.out.println("EQUAL");
        }
        sc.close();
    }
}
