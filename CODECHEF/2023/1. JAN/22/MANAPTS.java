import java.util.Scanner;
public class MANAPTS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(y/x);
        }
        sc.close();
    }
}
