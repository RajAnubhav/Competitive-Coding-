import java.util.Scanner;
public class AVGPROBLEM {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if((float)c<((float)(a+b)/2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
