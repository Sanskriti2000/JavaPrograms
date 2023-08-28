import java.io.*;
public class sum {
    public static void main(String args[])throws IOException{
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int a,n,s;
        s=0;
        for(a=1;a<=10;a++)
        {
                System.out.println("Enter your number:");
                n=Integer.parseInt(in.readLine());
                s=s+n;
        }
        System.out.println("The sum of any ten numbers is:"+s);
    }
}
