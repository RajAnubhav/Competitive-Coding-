import java.util.Scanner;
public class ACTEMP {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a<=b && c<=b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
