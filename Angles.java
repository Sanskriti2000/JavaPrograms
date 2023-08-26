import java.io.*;
public class Angles {
    public static void main(String args[])throws IOException{
        int a,b,sum;
        char ch;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter two angles.");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        sum=a+b;
        System.out.println("Enter 'c' for Complementary, 's' for Supplementary");
        System.out.println("Enter your choice.");

        ch=(char)(in.read());
        switch(ch)
        {
            case 'c':
                if (sum == 90)
                    System.out.println("Complementary Angles.");
                else
                    System.out.println("Not Complementary Angles.");
                break;
            case 's':
                if (sum == 180)
                    System.out.println("Supplemtary Angles.");
                else
                    System.out.println("Not Supplementary Angles.");
                break;
            default:
                System.out.println("Wrong Choice.");
            }
        }
    }

