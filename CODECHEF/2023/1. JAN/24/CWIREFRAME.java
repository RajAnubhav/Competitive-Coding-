import java.util.Scanner;
public class CWIREFRAME {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m, x;
            n = sc.nextInt();
            m = sc.nextInt();
            x = sc.nextInt();
            System.out.println(x*(2*(n+m)));
        }
        sc.close();
    }
}
