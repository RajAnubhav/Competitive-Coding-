import java.util.Scanner;

public class SLOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m, s;
            m = sc.nextInt();
            s = sc.nextInt();
            System.out.println(m/s);
        }
        sc.close();
    }
}
