import java.util.Scanner;

public class FLOW005 {

    static int approach1(int n){
        int pos=0, n2=0, n1=0, n5=0, n10=0, n50=0, n100=0;
            while(n!=0){
                int rem = n%10;
                if(pos==0){
                    if(rem%2>=0 && rem/2>=0){
                        n2 = rem/2;
                        rem = 1;
                    }else
                        n1 = rem;
                }else if(pos==1){
                    if(rem%5>0 && rem/5>0){
                        n50 = rem/5;
                        rem = rem-(n50*5);
                    }else
                        n10 = rem;
                }else if(pos>=2){
                    n100 = n;
                    break;
                }
                pos++;
                n/=10;
            }
        int res = n1+n2+n5+n10+n50+n100;
        return res;
    }

    static int approach2(int n){
        int n100=0, n50=0, n10=0, n5=0, n2=0, n1=0;
        if(n>=100){
            n100 = n/100;
            n -= n100*100;
        }
        if(n>=50){
            n50 = n/50;
            n -= n50*50;
        }
        if(n>=10){
            n10 = n/10;
            n -= n10*10;
        }
        if(n>=5){
            n5 = n/5;
            n -= n5*5;
        }
        if(n>=2){
            n2 = n/2;
            n -= n2*2;
        }else {
            n1 = n;
        } 
        int res = n100+n50+n10+n5+n2+n1;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            // int n = 242;
            // System.out.print(approach2(n)+" ");
            System.out.println(approach2(n));
        }
        sc.close();
    }
}
