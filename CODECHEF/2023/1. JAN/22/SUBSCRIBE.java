import java.util.Scanner;
public class SUBSCRIBE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<=30)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
