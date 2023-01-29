import java.util.Scanner;

public class CHEFTRANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if((x+y)>z)
                System.out.println("TRAIN");
            else if((x+y)<z)
                System.out.println("PLANEBUS");
            else 
                System.out.println("EQUAL");
        }
        sc.close();
    }
}
