import java.util.Scanner;

public class CARCHOICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1, x2, y1, y2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            float car1 = y1/x1;
            float car2 = y2/x2;
            if(car1<car2)
                System.out.println(-1);
            else if(car1==car2)
                System.out.println(0);
            else 
                System.out.println(1);
        }
        sc.close();
    }
}
