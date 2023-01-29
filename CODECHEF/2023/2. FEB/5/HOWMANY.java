import java.util.Scanner;

public class HOWMANY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0, pos=0;
        while(n!=0){
            rem = n%10;
            pos++;
            n/=10;
        }
        if(pos<=3)
            System.out.println(pos);
        else
            System.out.println("More than 3 digits");
        sc.close();
    }
}
