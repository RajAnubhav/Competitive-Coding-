import java.util.*;

public class FLOORS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            int curFloor = x/10 + 1;
            int desFloor = y/10;
            System.out.println(Math.abs(curFloor-desFloor));
        }
        sc.close();
    }
}
