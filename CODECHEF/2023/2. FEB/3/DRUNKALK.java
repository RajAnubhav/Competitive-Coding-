import java.util.Scanner;

public class DRUNKALK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            System.out.println(k+(k%3));
        }
        sc.close();
    }
}
