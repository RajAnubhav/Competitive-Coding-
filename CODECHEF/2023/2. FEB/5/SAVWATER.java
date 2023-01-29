import java.util.Scanner;

public class SAVWATER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int h, x, y, c;
            h = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            c = sc.nextInt();
            if((x+(y/2))*h<=c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }    
}
