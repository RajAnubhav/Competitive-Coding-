import java.util.Scanner;
public class INTRDSGN {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1, x2, y1, y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1+y1 < x2+y2)
                System.out.println(x1+y1);
            else
                System.out.println(x2+y2);
        }
        sc.close();
    }
}
