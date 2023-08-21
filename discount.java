import java.io.*;
public class discount
    {
        public static void main(String args[])throws IOException
        {
            int c;
            double pay=0,d=0;
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);

            System.out.println("Enter the total cost=");

            c = Integer.parseInt(in.readLine());
            if(c<=2000)
                d=(double)5/100*c;
            if((c>2000) && (c<=5000))
                d=(double)25/100*c;
            if((c>5000) && (c<=10000))
                d=(double)35/100*c;
            if(c>10000)
                d=(double)50/100*c;
            pay=c-d;
            System.out.println("The discount="+d);
            System.out.println("The amount to be paid="+pay);
        }
}
