import java.util.Scanner;
public class SST {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            /*
             *  a --\ /-->  10  => a*20
             *       X
             *  b --/ \-->  20  => b*10
            */
            if(20*a>10*b)
                System.out.println("FIRST");
            else if(20*a<10*b)
                System.out.println("SECOND");
            else
                System.out.println("ANY");
        }
        sc.close();
    }
}
