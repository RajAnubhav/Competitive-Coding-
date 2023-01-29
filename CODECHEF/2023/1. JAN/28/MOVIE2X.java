import java.util.Scanner;
public class MOVIE2X {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x-y/2);
        sc.close();
    }
}
