import java.util.Scanner;
public class MINPIZZA {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            if(n%4==0)
                System.out.println(n*x/4);
            else
                System.out.println(((n*x)/4)+1);
        }
        sc.close();
    }
}
