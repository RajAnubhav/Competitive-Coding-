import java.util.Scanner;
public class CANDYDIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            if(n%m==0 && ((n/m)%2==0))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        sc.close();
    }
}
