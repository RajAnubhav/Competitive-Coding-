import java.util.Scanner;
public class CHAIRS_ {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x>y)
                System.out.println(x-y);
            else
                System.out.println(0);
        }
        sc.close();
    }
}
