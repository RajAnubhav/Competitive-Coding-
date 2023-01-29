import java.util.Scanner;
public class BUILDINGRACE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, x, y;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if(a/x < b/y)
                System.out.println("CHEF");
            else if(a/x > b/y)
                System.out.println("CHEFINA");
            else 
                System.out.println("BOTH");
        }
        sc.close();
    }
}