//accept 10 different numbers in S.D.A, and display the maximum and minimum of the array
import java.io.*;
public class Max_Min
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i,j,min,max;
        int m[]=new int[10];

        for(i=0;i<10;i++){
            System.out.println("Enter the number in the cell: ");
            m[i]=Integer.parseInt(in.readLine());
        }

        max=m[0];
        min=m[0];
        for(i=0;i<10;i++){
            if(m[i]>max)
                max=m[i];
            if(m[i]<min)
                min=m[i];
        }
        System.out.println("The greatest of the array elements: "+max);
        System.out.println("The smallest of the array elements: "+min);
    }
}
