import java.util.Scanner;

public class CHSFORMAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a+b<3)
                System.out.println("1");
            else if((a+b)<=10)
                System.out.println("2");
            else if((a+b)<=60)
                System.out.println("3");
            else 
                System.out.println("4");
        }
        sc.close();
    }
}
