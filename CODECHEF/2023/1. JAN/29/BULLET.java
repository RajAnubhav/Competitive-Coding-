import java.util.Scanner;
public class BULLET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(y/x > z)
                System.out.println(0);
            else
                System.out.println(z-(y/x));
        }
        sc.close();
    }
}
