import java.util.Scanner;

public class SOCKS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==b || a==c || b==c)
            System.out.println("YES");
        else 
            System.out.println("NO");
        sc.close();
    }
}
