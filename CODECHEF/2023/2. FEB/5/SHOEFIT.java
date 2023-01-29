import java.util.Scanner;

public class SHOEFIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a[] = new int[3];
            for(int i=0; i<3; i++)
                a[i] = sc.nextInt();
            
            int l=0, r=0;
            for(int i=0; i<3; i++){
                if(a[i]==1)
                    r++;
                else
                    l++;
            }
            if(l>0 && r>0)
                System.out.println(1);
            else
                System.out.println(0);
        }
        sc.close();
    }
}
