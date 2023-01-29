import java.util.Scanner;

public class EQLZING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(Math.abs(a-b)%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
