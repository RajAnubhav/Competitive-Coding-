import java.util.Scanner;
public class CHEFAPPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int s, x, y, z;
            s = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(z<=(s-(x+y)))
                System.out.println(0);
            else if(z<=(s-x)||z<=(s-y))
                System.out.println(1);
            else
                System.out.println(2);
        }
        sc.close();
    }
}
