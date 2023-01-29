import java.util.Scanner;

public class UWCOI21A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
		    if(n%2==0){
		        System.out.println(2+" "+n/2);
		    }
		    else{
		        System.out.println(1+" "+n);
		    }
        }
        sc.close();
    }    
}