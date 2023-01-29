import java.util.Scanner;
public class CHEAPFOOD {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x*0.1 > 100)
                System.out.println((int)(x*(0.1)));
            else
                System.out.println("100");
        }
        sc.close();
    }
}
