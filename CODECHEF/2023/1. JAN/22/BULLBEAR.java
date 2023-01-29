import java.util.Scanner;
public class BULLBEAR {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x>y)
                System.out.println("LOSS");
            else if(x<y)
                System.out.println("PROFIT");
            else
                System.out.println("NEUTRAL");
        }
        sc.close();
    }
}
