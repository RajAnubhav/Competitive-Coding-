import java.util.Scanner;
public class TESTEDEC {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if((x*2)>(y*5))
                System.out.println("CHOCOLATE");
            else if((x*2)<(y*5))
                System.out.println("CANDY");
            else
                System.out.println("EITHER");
        }
        sc.close();
    }
}
