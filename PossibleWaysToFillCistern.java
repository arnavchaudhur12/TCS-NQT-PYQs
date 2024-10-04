import java.util.*;

public class PossibleWaysToFillCistern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int k=sum(sum(n)*r);
        System.out.println(k);
    }

    static int sum(int n){
        int copy=n;
        int rem=0;int sum=0;
        while(copy!=0){
            rem=copy%10;
            sum+=rem;
            copy/=10;
        }
        return sum;
    }
}
