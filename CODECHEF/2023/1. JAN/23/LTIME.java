import java.util.Scanner;
public class LTIME {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x>=1 && x<=4)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
