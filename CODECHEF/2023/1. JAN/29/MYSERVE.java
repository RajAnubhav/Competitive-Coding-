import java.util.Scanner;
public class MYSERVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int p, q;
            p = sc.nextInt();
            q = sc.nextInt();
            if(p==q)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
        sc.close();
    }
}
