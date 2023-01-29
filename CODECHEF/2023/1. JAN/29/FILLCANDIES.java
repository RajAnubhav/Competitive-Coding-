import java.util.Scanner;
public class FILLCANDIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k, m;
            n = sc.nextInt();
            k = sc.nextInt();
            m = sc.nextInt();
            if(n%2==0)
                System.out.println(n/(k*m));
            else
                System.out.println(n/(k*m)+1);
        }
        sc.close();
    }
}
