import java.util.Scanner;
public class WATERCOOLER1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, m;
            x = sc.nextInt();
            y = sc.nextInt();
            m = sc.nextInt();
            if(x*m < y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
