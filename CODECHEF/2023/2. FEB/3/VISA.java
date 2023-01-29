import java.util.Scanner;

public class VISA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1, x2, y1, y2, z1, z2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            z1 = sc.nextInt();
            z2 = sc.nextInt();
            if((x2>=x1)&&(y2>=y1)&&(z2<=z1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
