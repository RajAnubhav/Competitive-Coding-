import java.util.Scanner;

public class RELATIVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int g, c;
            g = sc.nextInt();
            c = sc.nextInt();
            System.out.println((int)(Math.pow(c, 2)/(2*g)));
        }
        sc.close();
    }
}
