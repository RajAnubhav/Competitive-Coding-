import java.util.Scanner;
public class TCKTFINE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, p, q;
            x = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            System.out.println(x*(Math.absExact(p-q)));
        }
        sc.close();
    }
}
