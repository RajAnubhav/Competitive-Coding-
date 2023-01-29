import java.util.Scanner;
public class PARTY2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x, k;
            n = sc.nextInt();
            x = sc.nextInt();
            k = sc.nextInt();
            if(k>=n*x){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
        sc.close();
    }
}
