import java.util.*;
public class ProductOfDigitsOfANumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int rem=0;int prod=1;
        while(copy!=0){
            rem=copy%10;
             prod=prod*(rem);
            copy/=10;
        }
        System.out.print(prod);
    }
}
