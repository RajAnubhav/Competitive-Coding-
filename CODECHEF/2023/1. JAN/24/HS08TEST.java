import java.util.*;
public class HS08TEST {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();
        if(x%5==0 && x<y){
            Formatter formatter = new Formatter();
            formatter.format("%,.2f", y-x-0.50);
            System.out.println(formatter);
        }
        sc.close(); 
    }
}
