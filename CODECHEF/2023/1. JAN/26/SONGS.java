import java.util.Scanner;
public class SONGS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            System.out.println(n/(x*3));
        }
        sc.close();
    }
}
