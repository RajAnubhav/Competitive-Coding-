import java.util.Scanner;

public class BIN_BAT {

    static int log2(int n){
        return (int)(Math.log(n)/Math.log(2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, a, b;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            int p = log2(n);
            int br = p-1;
            System.out.println(p*a + br*b);
        }
        sc.close();
    }
}
