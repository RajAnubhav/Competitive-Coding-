import java.util.Scanner;
public class TYRE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println(n*2 + m*4);
        }
        sc.close();
    }
}
