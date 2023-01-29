import java.util.Scanner;
public class TREETOPICS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, x;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        if(x==a || x==b || x==c)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
