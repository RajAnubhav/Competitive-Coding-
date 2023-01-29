import java.util.Scanner;

public class FLOW009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float q, p;
            p = sc.nextInt();
            q = sc.nextInt();
            float total = p*q;
            if(p>=1000)
                System.out.println(total*(0.9));
            else 
                System.out.println(total);
        }
        sc.close();
    }
}
