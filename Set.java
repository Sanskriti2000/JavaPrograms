
import java.io.*;
public class Set {
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n,s1=0,s2=0;

        System.out.println("Enter a number or zero to quit.");
        n=Integer.parseInt(in.readLine());

        while(n!=0){
            if(n>0 && n%2==0)
                s1=s1+n;
            if(n<0 && n%2!=0)
                s2=s2+n;

            System.out.println("Do you want to continue?");
            System.out.println("Enter a number or zero to quit.");
            n= Integer.parseInt(in.readLine());
        }
        System.out.println("The set of all positive numbers:"+s1);
        System.out.println("The set of all negative numbers:"+s2);
    }
}
