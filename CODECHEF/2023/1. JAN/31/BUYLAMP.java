import java.util.Scanner;

public class BUYLAMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k, x, y;
            n = sc.nextInt(); // no of lamps to be bought
            k = sc.nextInt(); // atleast k lamps are red
            x = sc.nextInt(); // red lamp's price
            y = sc.nextInt(); // blue lamp's price
            if(x<y)
                if(k==0)
                    System.out.println((n-k)*x);
                else
                    System.out.println(x*k + (n-k)*x);
            else 
                    if(k==0)
                        System.out.println((n-k)*x);
                    else
                        System.out.println(x*k + (n-k)*y);

        }
    }
}
