import java.util.Scanner;

public class FLOW008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n<10)
                System.out.println("THANKS FOR HELPING CHEF!");
            else
                System.out.println(-1);
        }
        sc.close();
    }
}
