import java.util.Scanner;
public class SIXFRIENDS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x*3 < y*2)
                System.out.println(x*3);
            else
                System.out.println(y*2);
        }
        sc.close();
    }
}
