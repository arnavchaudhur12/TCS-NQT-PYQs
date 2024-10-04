import java.util.*;
public class CountOfMaxValueInStringSubset {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int c=0;int max=0;
        int len=str.length();
        for(int i=0;i<len;i=i+n){
            String currentSet=str.substring(i,Math.min((i+n),len));
            int countA=count(currentSet);
            max=Math.max(max,countA);
        }
        System.out.println(max);
    }
    static int count(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                c++;
            }
        }
        return c;
    }
}
