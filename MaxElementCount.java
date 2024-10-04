import java.util.*;
public class MaxElementCount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
     int max=Integer.MIN_VALUE;
     int c=0;
     for(int i=0;i<n;i++){
         if(arr[i]>max){
             max=arr[i];
             c++;
         }
     }
     System.out.println(c);

    }
}
