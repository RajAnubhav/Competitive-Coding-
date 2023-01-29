import java.util.Scanner;

public class HOWMANY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig=0;
        while(n!=0){
            int k = n%10;
            dig++;
            n/=10;
        }
        System.out.println(dig);
        sc.close();
    }
}
