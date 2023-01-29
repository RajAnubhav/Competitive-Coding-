import java.util.Scanner;

public class INDIVISIBLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for(int i=2; i<100; i++){
                if(a%i!=0 && b%i!=0 && c%i!=0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
