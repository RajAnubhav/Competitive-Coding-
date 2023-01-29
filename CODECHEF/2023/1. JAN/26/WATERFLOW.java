import java.util.Scanner;
public class WATERFLOW {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w, x, y, z;
            w = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(w+y*z==x)
                System.out.println("FILLED");
            else if(w+y*z<x)
                System.out.println("UNFILLED");
            else 
                System.out.println("OVERFLOW");
        }
        sc.close();
    }
}
