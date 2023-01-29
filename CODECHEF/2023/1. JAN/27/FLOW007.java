import java.util.Scanner;
public class FLOW007 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int res = 0;
            while(n!=0){
                int rem = n%10;
                res = res*10+rem;
                n /= 10;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
