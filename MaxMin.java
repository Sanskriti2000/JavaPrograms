import java.io.*;
public class MaxMin {
    public static void main(String args[]) throws IOException{
     InputStreamReader read=new InputStreamReader(System.in);
     BufferedReader in = new BufferedReader(read);
     int a,m,n,max=0,min=0;
     System.out.println("Enter your first number.");
     n=Integer.parseInt(in.readLine());
     min=n;max=n;
     for(a=2;a<=10;a++){
         System.out.println("Enter the remaining nine numbers:");
         m=Integer.parseInt(in.readLine());
         if(m<min)
             min=m;
         if(m>max)
             max=m;
     }
     System.out.println("Minimum of ten numbers:"+min);
     System.out.println("maximum of ten numbers:"+max);
    }
}
