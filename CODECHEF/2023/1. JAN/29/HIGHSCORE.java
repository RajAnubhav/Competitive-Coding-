import java.util.*;
public class HIGHSCORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []a = new int[4];
            for(int i=0; i<4; i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[3]);
        }
        sc.close();
    }
}
