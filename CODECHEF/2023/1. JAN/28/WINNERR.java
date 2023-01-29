import java.util.Scanner;
public class WINNERR {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int pa, pb, qa, qb;
            pa = sc.nextInt();
            pb = sc.nextInt();
            qa = sc.nextInt();
            qb = sc.nextInt();
            int t1=0, t2=0; // flags
            if(pa>pb)
                t1=pa;
            else
                t1 = pb;

            if(qa>qb)
                t2=qa;
            else
                t2=qb;

            if(t1<t2)
                System.out.println("P");
            else if(t1>t2)
                System.out.println("Q");
            else 
                System.out.println("TIE");
            
        }
        sc.close();
    }
}
