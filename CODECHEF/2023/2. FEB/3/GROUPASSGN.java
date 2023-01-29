import java.util.Scanner;

public class GROUPASSGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt(); // groups
            x = sc.nextInt(); // pos
            int y = 2*n;
            System.out.println(y+1-x);
        }
        sc.close();
    }
}
