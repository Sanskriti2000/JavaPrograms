import java.io.*;
public class bill
    {
        public static void main(String args[])throws IOException
        {
            int u;
            float a=0,c=0;

            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in =new BufferedReader(read);

            System.out.println("Enter the units consumed=");
            u= Integer.parseInt(in.readLine());

            if(u<=100) {
                c = (u * 80) / 100;
                a = (c + 50);
            }

            if((u>100) && (u<=200))  {
                c = (u*1);
                a = (c+50);
            }

            if(u>200){
                c = (u*125)/100;
                a = (c+50);
            }
            System.out.println("The units consumed="+u);
            System.out.println("The charge="+c);
            System.out.println("The additional charge= Rs.50");
            System.out.println("The total amount to be paid="+a);
        }
}
