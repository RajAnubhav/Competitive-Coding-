import java.util.Scanner;

public class OLYRANK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int g1, s1, b1, g2, s2, b2;
            g1 = sc.nextInt();
            s1 = sc.nextInt();
            b1 = sc.nextInt();
            g2 = sc.nextInt();
            s2 = sc.nextInt();
            b2 = sc.nextInt();
            if((g1+b1+s1)>(g2+b2+s2))
                System.out.println("1");
            else 
                System.out.println("2");
        }
        sc.close();
    }
}
