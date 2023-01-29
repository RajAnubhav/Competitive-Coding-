import java.util.Scanner;
public class XJUMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println((x/y)+(x%y));
        }
        sc.close();
    }
}
