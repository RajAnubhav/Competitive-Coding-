import java.util.Scanner;

public class SUPCHEF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m, n, k;
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();
            if(m>(n*k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
