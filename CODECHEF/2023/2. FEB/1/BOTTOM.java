import java.util.Scanner;

public class BOTTOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            System.out.println(7-x);
        }
        sc.close();
    }
}
