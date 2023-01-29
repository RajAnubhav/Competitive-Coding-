import java.util.Scanner;
public class TRANSFORM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x%3==1)
                System.out.println("HUGE");
            else if(x%3==2)
                System.out.println("SMALL");
            else 
                System.out.println("NORMAL");
        }
        sc.close();
    }
}
