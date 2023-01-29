import java.util.Scanner;
public class FINDSHOES {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int left = (n-m)>0?n-m:0;
            int right = n;
            System.out.println(left+right);
        }
        sc.close();
    }
}
