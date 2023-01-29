import java.util.Scanner;
public class TODOLIST {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []a = new int [n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int count=0;
            for(int i=0; i<n; i++){
                if(a[i]>=1000)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
