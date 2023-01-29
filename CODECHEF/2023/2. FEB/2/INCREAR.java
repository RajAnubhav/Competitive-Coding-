import java.util.Scanner;

public class INCREAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(Math.abs(x-y)%2==0)
                System.out.println(Math.abs(x-y)/2);
            else
                System.out.println(Math.abs(x-y));
        }
        sc.close();
    }
}
