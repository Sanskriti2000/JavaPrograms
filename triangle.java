import java.io.BufferedReader;
import java.io.*;

public class triangle
{
        public static void main(String args[])throws IOException
        {
            int a,b,c;
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);
            System.out.println("Enter three sides of a triangle:");
            a = Integer.parseInt(in.readLine());
            b = Integer.parseInt(in.readLine());
            c = Integer.parseInt(in.readLine());
            if((a==b) && (b==c))
                System.out.println("Equilateral Triangle");
            else if((a==b) || (b==c) || (c==a))
                System.out.println("Isosceles Triangle");
            else if((a!=b) && (b!=c) && (c!=a))
                System.out.println("Scalene Triangle");
        }
}

