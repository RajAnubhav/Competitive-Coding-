import java.util.Scanner;
public class TALLER {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y)
                System.out.println("A");
            else
                System.out.println("B");
        }
        sc.close();
    }
}
