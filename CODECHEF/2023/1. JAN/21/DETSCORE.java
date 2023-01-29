import java.util.Scanner;
public class DETSCORE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, n;
            x = sc.nextInt();
            n = sc.nextInt();
            int points = x/10;
            System.out.println(n*points);
        }
        sc.close();
    }
}
