import java.io.*;
public class equation
{
    public static void main(String args[])throws IOException
    {
        int a, b, c;
        double d, r1, r2;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the value of a, b, c = ");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());

        d=Math.sqrt(b*b-4*a*c);
        if((d>0) || (d==0))
        {
            r1=(-b+d)/(2*a);
            r2=(-b-d)/(2*a);

            System.out.println("Roots are:"+r1+ "and"+r2);
        }
        else
            System.out.println("Roots are imaginary and unequal");
    }
}
