import java.util.Scanner;

public class MIXTURE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>0 && b>0)
                System.out.println("SOLUTION");
            else if(b==0)
                System.out.println("SOLID");
            else 
                System.out.println("LIQUID");
        }
        sc.close();
    }
}
