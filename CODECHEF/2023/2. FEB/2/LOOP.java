import java.util.Scanner;

public class LOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, m;
            a = sc.nextInt();
            b = sc.nextInt();
            m = sc.nextInt();
            if(Math.abs(a-b)<=Math.abs(b-m))
                System.out.println(Math.abs(a-b));
            else
                System.out.println(Math.abs(b-m)+1);
        }
        sc.close();
    }
}
