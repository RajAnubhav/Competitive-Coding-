import java.util.Scanner;
public class WTRMIXING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, x, y;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if(a>b)
                if((a-b)<=y)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            else
                if((b-a)<=x)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }   
        sc.close();
    }
}
