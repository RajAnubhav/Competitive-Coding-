import java.util.Scanner;
public class PRACTICEPERF {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []p = new int [4];
        for(int i=0; i<4; i++){
            p[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0; i<4; i++){
            if(p[i]>=10)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
