import java.util.Scanner;

public class WATERCOOLER2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if((y/x)>1)
                System.out.println(y/x);
            else
                System.out.println(0);
        }
        sc.close();
    }
}
