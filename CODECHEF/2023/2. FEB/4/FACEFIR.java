import java.util.Scanner;

public class FACEFIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int dir = x%4;
            switch(dir){
                case 1:
                    System.out.println("EAST");
                    break;
                case 2:
                    System.out.println("SOUTH");
                    break;
                case 3: 
                    System.out.println("WEST");
                    break;
            }
        }
        sc.close();
    }
}
