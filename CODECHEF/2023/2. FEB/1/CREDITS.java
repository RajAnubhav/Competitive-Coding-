import java.util.Scanner;

public class CREDITS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<35)
                System.out.println("UNDERLOAD");
            else if(x>65)
                System.out.println("OVERLOAD");
            else 
                System.out.println("NORMAL");
        }
        sc.close();
    }
}
