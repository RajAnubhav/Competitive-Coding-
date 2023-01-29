import java.util.Scanner;
public class FLIPCARDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            if(n>x)
                System.out.println(x);
            else    
                System.out.println(0);
        }
        sc.close();
    }
}
