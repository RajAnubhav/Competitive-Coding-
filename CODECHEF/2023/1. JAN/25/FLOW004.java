import java.util.Scanner;
public class FLOW004 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int last = n%10;
            int res = 0;
            while(n!=0){
                int rem = n%10;
                res = res*10 + rem;
                n/=10;
            }
            int first = res%10;
            System.out.println(first+last);
        }
        sc.close();
    }
}
