import java.util.Scanner;

public class AREAPERI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        l = sc.nextInt();
        b = sc.nextInt();
        if((l*b)<(2*(l+b)))
            System.out.println("PERI\n" + (2*(l+b)));
        else if((l*b)<(2*(l+b)))
            System.out.println("AREA\n" + (l*b));
        else 
            System.out.println("EQ\n" + (l*b));
        sc.close();
    }
}
