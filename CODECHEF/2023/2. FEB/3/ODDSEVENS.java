import java.util.Scanner;

public class ODDSEVENS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b; 
            a = sc.nextInt();
            b = sc.nextInt();
            if((a+b)%2==0)
                System.out.println("BOB");
            else 
                System.out.println("ALICE");
        }
        sc.close();
    }
}
