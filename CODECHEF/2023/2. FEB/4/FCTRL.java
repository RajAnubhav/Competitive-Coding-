import java.util.Scanner;

public class FCTRL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum=0;
            while(n>0){
                sum += n/5;
                n /= 5;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
