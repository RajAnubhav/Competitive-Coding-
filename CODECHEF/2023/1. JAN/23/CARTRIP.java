import java.util.Scanner;
public class CARTRIP {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<300){
                System.out.println(3000);
            }else
                System.out.println(x*10);
        }
        sc.close();
    }
}
