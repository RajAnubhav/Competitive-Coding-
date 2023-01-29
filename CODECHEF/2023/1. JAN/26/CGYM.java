import java.util.Scanner;
public class CGYM {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(z>=(x+y))
                System.out.println("2");
            else if(z>=x)
                System.out.println("1");
            else
                System.out.println("0");
        }
        sc.close();
    }
}
