import java.util.Scanner;
public class HEIGHTRATION {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
        sc.close();
    }
}
