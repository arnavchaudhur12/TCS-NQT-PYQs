import java.util.*;
public class RoundTableSeatingArrangement {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int z=fact(n)*2;
        System.out.println(z);
    }
    static int fact(int num){
        if(num==0 || num==1)
            return 1;
        else
            return fact(num-1)*num;
    }
}
