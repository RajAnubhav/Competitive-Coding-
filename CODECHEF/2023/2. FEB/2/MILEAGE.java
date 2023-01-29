import java.util.Scanner;

public class MILEAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x, y, a, b;
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if(((n/a)*x)<((n/b)*y))
                System.out.println("PETROL");
            else if(((n/a)*x)>((n/b)*y))
                System.out.println("DIESEL");
            else 
                System.out.println("ANY");
        }
        sc.close();
    }
}
