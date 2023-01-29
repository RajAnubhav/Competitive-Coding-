import java.util.Scanner;

public class UTKPLC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char f, s, th, x, y;
            f = sc.next().charAt(0);
            s = sc.next().charAt(0);
            th = sc.next().charAt(0);
            x = sc.next().charAt(0);
            y = sc.next().charAt(0);
            if(f==x)
                System.out.println(x);
            else if(f==y)
                System.out.println(y);
            else if(s==x)
                System.out.println(x);
            else if(s==y)
                System.out.println(y);
            else 
                System.out.println(th);
        }
        sc.close();
    }
}
