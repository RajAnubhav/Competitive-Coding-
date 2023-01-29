import java.util.Scanner;
public class C_RATING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x/y == 0)
                if((y-x)%8==0)
                    System.out.println((y-x)/8);
                else
                    System.out.println(((y-x)/8)+1);
            else
                System.out.println((y-x)/8);
        }
        sc.close();
    }
}
