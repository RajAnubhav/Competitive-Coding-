import java.util.*;
public class MARBLES
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        long n = sc.nextInt();
	        long k = sc.nextInt();
	        
	        if(n==k){
	            System.out.println("1");
	        }
	        else{
	            n = n-k;
	            long sum = 1;
	            
	            for(int i=1; i<k; i++){
	                sum = sum*(n+i);
	                sum = sum/i;
	            }
                System.out.println(sum);	            
	        }
	    }
        sc.close();
	}
}