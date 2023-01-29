import java.util.*;
public class CHEFRUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-->0){
            double x1, x2, x3, v1, v2;
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();
            v1 = sc.nextDouble();
            v2 = sc.nextDouble();
            double chefT = (x3-x1)/v1;
            double kefaT = (x2-x3)/v2;
            if(chefT<kefaT)
                System.out.println("CHEF");
            else if(chefT>kefaT)
                System.out.println("KEFA");
            else 
                System.out.println("DRAW");
        }
        sc.close();
    }
}
