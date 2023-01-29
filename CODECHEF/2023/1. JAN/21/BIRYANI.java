import java.util.Scanner;
class BIRYANI{
    public static void main(String []aegs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x*y);
        }
        sc.close();
    }
}