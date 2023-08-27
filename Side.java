import java.io.*;
public class Side {
    public static void main(String args[])throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int c;
        float s,a,b,m,n,p=0,k=0;
        double area;

        System.out.println("1. Area of an Equilateral Triangle.");
        System.out.println("2. Area of an Isoceles Traiangle.");
        System.out.println("3.Area of a Scalene Triangle.");
        System.out.println("Enter your choice.");
        c=Integer.parseInt(in.readLine());

        switch(c)
        {
            case 1:
                System.out.println("Enter side of an equilateral Triangle.");
                s=Float.parseFloat(in.readLine());
                area=(Math.sqrt(3)*s*s)/4;
                System.out.println("Area="+area);
                break;

            case 2:
                System.out.println("Enter side and base of Isoceles Triangle");
                a=Float.parseFloat(in.readLine());
                b=Float.parseFloat(in.readLine());
                area=b/4*(Math.sqrt(4*a*a-b*b));
                System.out.println("Area="+area);
                break;

            case 3:
                System.out.println("Enter sides of Scalene Triangle.");
                m=Float.parseFloat(in.readLine());
                n=Float.parseFloat(in.readLine());
                k=(m+n+p)/2;
                area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
                System.out.println("Area="+area);
                break;
            default:
                System.out.println("Wrong Choice.");
        }
    }
}
