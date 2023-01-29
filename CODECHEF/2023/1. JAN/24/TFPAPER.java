import java.util.Scanner;
public class TFPAPER {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(n-k);
        }
        sc.close();
    }
}
