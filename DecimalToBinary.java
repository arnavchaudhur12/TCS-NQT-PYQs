
import java.util.*;
public class DecimalToBinary {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str=Integer.toBinaryString(n);

    StringBuilder ob=new StringBuilder();

    for(int i=0;i<str.length();i++) {
        if (str.charAt(i) == '0') {
            ob.append('1');
        } else {
            ob.append('0');
        }
    }
    String str2=ob.toString();
int d=Integer.parseInt(str2,2);
System.out.println(d);

}

}
