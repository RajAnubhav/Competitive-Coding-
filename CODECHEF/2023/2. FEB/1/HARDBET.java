import java.util.Scanner;

public class HARDBET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a<b && a<c)
                System.out.println("DRAW");
            else if(b<c)
                System.out.println("BOB");
            else 
                System.out.println("ALICE");
        }
        sc.close();
    }
}
