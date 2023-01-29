import java.util.Scanner;
public class BOBBANK {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w, x, y, z;
            w = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println(w+(x-y)*z);
        }
        sc.close();
    }
}
