import java.util.Scanner;
public class CMASKS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x*100 < y*10)
                System.out.println("DISPOSABLE");
            else
                System.out.println("CLOTH");
        }
        sc.close();
    }
}
