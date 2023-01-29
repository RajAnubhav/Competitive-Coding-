import java.util.Scanner;
public class M1ENROL {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x>=y)
                System.out.println("0");
            else
                System.out.println(y-x);
        }
        sc.close();
    }
}
