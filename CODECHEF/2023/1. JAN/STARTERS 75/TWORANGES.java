import java.util.Scanner;

public class TWORANGES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            
            int arr[] = new int[Math.max(Math.max(a, b), Math.max(c, d))+1];
            for(int i=0; i<arr.length; i++){
                if((i>=a && i<=b)||(i>=c && i<=d))
                    arr[i]++;
            }
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0)
                    count++;
            }
            System.out.println(count);
        }    
        sc.close();
    }

}
