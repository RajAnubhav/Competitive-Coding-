import java.util.Scanner;
public class TESTAVG {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if((((a+b)/2) < 35)||(((a+c)/2) < 35)||(((c+b)/2) < 35))
                System.out.println("FAIL");
            else
                System.out.println("PASS");
        }
        sc.close();
    }
}
