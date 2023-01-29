import java.util.Scanner;
public class FEVER {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x>98)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
