import java.util.Scanner;

public class BOOKPACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt(); // shelves
            y = sc.nextInt(); // books
            z = sc.nextInt(); // maximum capacity of cardboard
            if((y/z)>0 && (y%z)>0)
                System.out.println(x*((y/z) + 1));
            else
                System.out.println((x*y)/z);
        }
        sc.close();
    }
}
