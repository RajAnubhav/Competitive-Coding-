import java.util.Scanner;

public class WORDLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s, a;
            s = sc.next();
            a = sc.next();
            for(int i=0; i<5; i++){
                if(s.charAt(i)==a.charAt(i))
                    System.out.print("G");
                else
                    System.out.print("B");
            }
            System.out.println();
        }
        sc.close();
    }
}
