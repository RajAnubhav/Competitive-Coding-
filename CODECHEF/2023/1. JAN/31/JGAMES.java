import java.util.Scanner;

public class JGAMES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();            
            if((x%y)%2==0)
                System.out.println("JANMANSH");
            else
                System.out.println("JAY");
        }
    }
}
