import java.util.Scanner;
public class BROKENPHONE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x<y)
                System.out.println("REPAIR");
            else if(x>y)
                System.out.println("NEW PHONE");    
            else 
                System.out.println("ANY");

        }
        sc.close();
    }
}
