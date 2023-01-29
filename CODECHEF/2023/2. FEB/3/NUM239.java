import java.util.Scanner;

public class NUM239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();
            int count=0;
            for(int i=l; i<=r; i++){
                int rem = i%10;
                if(rem==2 || rem==3 || rem==9)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
