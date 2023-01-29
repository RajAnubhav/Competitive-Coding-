import java.util.Scanner;
public class TAXES {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x>100)
                System.out.println(x-10);
            else
                System.out.println(x);
        }
        sc.close();
    }
}
