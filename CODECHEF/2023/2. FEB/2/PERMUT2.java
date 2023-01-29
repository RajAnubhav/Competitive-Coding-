import java.util.Scanner;
// as it is strictly mentioned here that is adhere to the format shown in the output.
public class PERMUT2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    while(true)
	    {
	        int n = sc.nextInt();
	        if(n == 0)
	            break;
	        int arr[] = new int[n];
	        for(int i = 0; i < n;i++)
	            arr[i] = sc.nextInt();
	        
	        int amb = 1;
	        for(int i=0;i<n;i++)
	            if(arr[arr[i] - 1] != (i+1))
	                amb = 0;
	            
	        
	        if(amb == 1)
	            System.out.println("ambiguous");
	        else
	            System.out.println("not ambiguous");
	    }
        sc.close();
    }
}