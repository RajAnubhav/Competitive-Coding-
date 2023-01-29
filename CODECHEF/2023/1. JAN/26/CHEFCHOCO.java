import java.util.Scanner;
public class CHEFCHOCO {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int c, x, y;
            c = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println((c-x)*y);
        }
        sc.close();
    }
}
