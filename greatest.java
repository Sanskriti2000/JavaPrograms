import java.io.*;
public class greatest
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter three numbers:");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        if((a>b) && (a>c))
            System.out.println(a+"is the greatest number");
        else if((b>a) && (b>c))
            System.out.println(b+"is the greatest number");
        else if((c>a) && (c>b))
            System.out.println(c+"is the greatest number");
        else
            System.out.println("Numbers are equal");
    }
}
