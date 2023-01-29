import java.util.Scanner;
public class RAINFALL1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<3)
                System.out.println("LIGHT");
            else if(x>=3 && x<7)
                System.out.println("MODERATE");
            else
                System.out.println("HEAVY");
        }
        sc.close();
    }
}
