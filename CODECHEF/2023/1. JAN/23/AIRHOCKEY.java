import java.util.Scanner;
public class AIRHOCKEY {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>b)
                System.out.println(7-a);
            else
                System.out.println(7-b);
        }
        sc.close();
    }
}
