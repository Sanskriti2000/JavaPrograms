import java.io.*;
public class Prime {
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,n,c=0;
        System.out.println("Enter a number:");
        n=Integer.parseInt(in.readLine());

        for(a=1;a<=n;a++){
            if(n%a==0)
                c=c+1;
        }
        if(c==2)
            System.out.println("Prime Number.");
        else
        System.out.println("Not a Prime Number.");
    }
}
