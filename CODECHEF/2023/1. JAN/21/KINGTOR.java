import java.util.Scanner;
public class KINGTOR {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println((n*5) + (m*7));
        }
        sc.close();
    }
}
