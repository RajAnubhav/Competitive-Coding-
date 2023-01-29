import java.util.Scanner;
public class JCOINS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x*10 + y*5);
        }
        sc.close();
    }
}
