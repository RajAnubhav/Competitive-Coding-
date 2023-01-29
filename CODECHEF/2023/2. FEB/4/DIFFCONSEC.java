import java.util.Scanner;

public class DIFFCONSEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int count0 = 0, count1=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='0')
                    count0++;
                else
                    count1++;
            }
            if(count0<count1)
                System.out.println(count1/2);
            else if(count0>count1)
                System.out.println(count0/2);
            else 
                System.out.println(0);
        }
        sc.close();
    }
}
