import java.util.Scanner;

public class FLOW010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char c = sc.next().charAt(0);
            if(c=='b' || c=='B')
                System.out.println("BATTLESHIP");
            else if(c=='c' || c=='C')
                System.out.println("CRUISER");
            else if(c=='d' || c=='D')
                System.out.println("DESTROYER");
            else 
                System.out.println("FRIGATE");
        }
        sc.close();
    }
}
