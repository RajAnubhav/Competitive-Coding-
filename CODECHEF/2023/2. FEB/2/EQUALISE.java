import java.util.Scanner;

public class EQUALISE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(((a>b) && (a/b)%4==0) || ((a<b) && (b/a)%4==0))
                System.out.println("YES");
            else if(a==b)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        sc.close();
    }
}
