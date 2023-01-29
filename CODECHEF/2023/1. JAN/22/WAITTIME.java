import java.util.Scanner;
public class WAITTIME {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k, x;
            k = sc.nextInt();
            x = sc.nextInt();
            System.out.println(k*7-x);
        }
        sc.close();
    }
}
