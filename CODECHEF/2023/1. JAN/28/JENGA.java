import java.util.Scanner;
public class JENGA {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            if(x>=n && x%n==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
