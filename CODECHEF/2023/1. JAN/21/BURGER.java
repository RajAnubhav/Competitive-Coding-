import java.util.Scanner;
public class BURGER {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>=b){
                System.out.println(b);
            }else
                System.out.println(a);
        }
        sc.close();
    }
}
