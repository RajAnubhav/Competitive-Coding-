import java.util.Scanner;
public class LASTLEVELS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt(); // levels
            y = sc.nextInt(); // minutes to complete each level
            z = sc.nextInt(); // break
            int br=0;
            if(x%3==0)
                br = (x/3)-1;
            else
                br = x/3;
            System.out.println((br*z)+(x*y));
        }
        sc.close();
    }
}
