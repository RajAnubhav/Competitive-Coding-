import java.util.Scanner;
public class MINHEIGHT {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, h;
            x = sc.nextInt();
            h = sc.nextInt();
            if(x>=h)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
