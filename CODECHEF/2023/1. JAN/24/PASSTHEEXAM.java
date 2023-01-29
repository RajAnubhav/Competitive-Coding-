import java.util.Scanner;
public class PASSTHEEXAM {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a>=10 && b>=10 && c>=10 && (a+b+c)>=100)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        sc.close();
    }
}
