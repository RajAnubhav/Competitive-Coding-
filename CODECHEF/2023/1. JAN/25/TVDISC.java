import java.util.Scanner;
public class TVDISC {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            int s = a-c;
            int y = b-d;
            if(s<y)
                System.out.println("FIRST");
            else if(y<s)
                System.out.println("SECOND");
            else
                System.out.println("ANY");
        }
        sc.close();
    }
}
