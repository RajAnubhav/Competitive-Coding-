import java.util.Scanner;

public class TLG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int int_win=0, int_lead=0; // intermediate win and intermediate lead
        for(int i=0; i<n; i++){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(int_lead<Math.abs(a-b))
                if(a>b){
                    int_win=1;
                    int_lead += a-b;
                }else{
                    int_win=2;
                    int_lead += b-a;
                }
        }
        System.out.println(int_win+" "+int_lead);
        sc.close();
    }
}
