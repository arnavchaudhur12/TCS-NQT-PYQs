import java.util.Scanner;

public class Chocolate_Factory {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    int c=0;//to track non zero elements
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                arr[c++]=arr[i];
        }
        for(int i=c;i<n;i++){//all the elements after c to 0
            arr[i]=0;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
