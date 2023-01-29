import java.util.Scanner;
public class DISCUS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt(); 
            b = sc.nextInt(); 
            c = sc.nextInt(); 
            if(a>b && a>c)
                System.out.println(a);
            else if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
        sc.close();
    }
}
