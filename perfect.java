import java.io.*;
public class perfect {
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,n,s;
        s=0;

        System.out.println("Enter your number.");
        n=Integer.parseInt(in.readLine());
        for(a=1;a<n;a++){
            if(n%a==0)
                s=s+a;
        }
        if(s==n)
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
    }
}
