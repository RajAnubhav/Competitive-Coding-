import java.util.Scanner;

public class PENALTY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a[] = new int[10];
            for(int i=0; i<10; i++)
                a[i] = sc.nextInt();
            int t1=0, t2=0;
            for(int i=0; i<a.length; i++){
                if(i%2==0){
                    if(a[i]==1)
                        t1++;
                }else{
                    if(a[i]==1)
                        t2++;
                }
            }

            if(t1>t2)
                System.out.println(1);
            else if(t1==t2)
                System.out.println(0);
            else
                System.out.println(2);
        }
        sc.close();
    }       
}
