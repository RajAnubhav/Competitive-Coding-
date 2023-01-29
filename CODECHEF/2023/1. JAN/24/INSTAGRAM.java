import java.util.Scanner;
public class INSTAGRAM {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x>10*y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
