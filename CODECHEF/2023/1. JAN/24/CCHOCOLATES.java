import java.util.Scanner;
public class CCHOCOLATES {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println((x*5+y*10)/z);
        }
        sc.close();
    }
}
