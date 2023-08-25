import java.io.*;
public class Menu
{
    public static void main(String args[])throws IOException
    {
        int l,b,ar,p,n;
        double d;
        char ch;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the length and breadth of a rectangle = ");
        l=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());

        System.out.println("Enter 1 for Area, 2 for Perimeter, 3 for Diagonal");
        System.out.println("Enter your choice.");
        n=Integer.parseInt(in.readLine());

        switch(n)
        {
            case 1:
                ar=l*b;
                System.out.println("Area of the rectangle = "+ar);
                break;
            case 2:
                p=2*(l+b);
                System.out.println("Perimeter of the rectangle = "+p);
                break;
            case 3:
                d=Math.sqrt(l*l+b*b);
                System.out.println("Diagonal of the rectangle = "+d);
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
