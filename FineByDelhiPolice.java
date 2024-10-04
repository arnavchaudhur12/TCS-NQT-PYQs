import java.util.*;
public class FineByDelhiPolice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int d=sc.nextInt();//date
        int x=sc.nextInt();//fine
        solve(arr,d,x);
    System.out.println();
solve1(arr,d,x);}
    static void solve1(int arr[],int d,int x){
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        int c1=0,c2=0;
        for(int num:arr){
            if(num%2==0){
                even.add(num);
                c1++;
            }
            else{
                odd.add(num);c2++;
            }

        }
        if(d%2==0){
            int sum=0;
            sum=c2*x;


            System.out.println(sum);
        }
        else {
int sum2=0;
sum2=c1*x;
            System.out.println(sum2);
        }

    }

    static void solve(int arr[],int d,int x){
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        for(int num:arr){
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }

        }
        if(d%2==0){
            int prod1=0;int sum=0;
            for(int num:odd){
                prod1=num*x;
                sum+=prod1;
            }
            System.out.println(sum);
        }
        else {

            int prod2=0;int sum2=0;
            for(int num:even){
                prod2=num*x;
                sum2+=prod2;
            }
            System.out.println(sum2);
        }

    }
}
