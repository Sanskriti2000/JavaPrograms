import java.io.*;
public class grades
    {
        public static void main(String args[])throws IOException
        {
            int m;

            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);

            System.out.println("Enter the marks=");
            m=Integer.parseInt(in.readLine());

            if(m>=80)
                System.out.println("Distinction");

            if((m>=60) && (m<80))
                System.out.println("First Division");

            if ((m>=45) && (m<60))
                System.out.println("Second Division");

            if((m>=40) && (m<45))
                System.out.println("Pass");

            if(m<40)
                System.out.println("Promotion not Granted");
        }
}
