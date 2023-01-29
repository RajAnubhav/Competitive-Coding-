import java.util.Scanner;
public class FIT {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            System.out.println(2*x*5);
        }
        sc.close();
    }
}
