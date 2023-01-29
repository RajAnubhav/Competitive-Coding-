import java.util.Scanner;

public class PROBCAT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<100)
                System.out.println("EASY");
            else if(x<200)
                System.out.println("MEDIUM");
            else if(x<300)
                System.out.println("HARD");
        }
        sc.close();
    }
}