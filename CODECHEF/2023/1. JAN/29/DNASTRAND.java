import java.util.Scanner;
public class DNASTRAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n;
            String s;
            n = sc.nextInt();
            s = sc.next();
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='A')
                    System.out.print('T');
                else if(s.charAt(i)=='T')
                    System.out.print('A');
                else if(s.charAt(i)=='C')
                    System.out.print('G');
                else if(s.charAt(i)=='G')
                    System.out.print('C');
            }
            System.out.println();
        }
        sc.close();
    }
}
