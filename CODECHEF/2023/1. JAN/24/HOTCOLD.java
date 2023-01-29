import java.util.Scanner;
public class HOTCOLD {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int c = sc.nextInt();
            if(c>20)
                System.out.println("HOT");
            else
                System.out.println("COLD");
        }
        sc.close();
    }
}
