import java.util.Scanner;
public class KITCHENSPICE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<4)
                System.out.println("MILD");
            else if(x>=4 && x<7)
                System.out.println("MEDIUM");
            else
                System.out.println("HOT");
        }
        sc.close();
    }
}
