import java.util.Scanner;
public class FAIRPASS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            if(k>n){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
        sc.close();
    }
}
