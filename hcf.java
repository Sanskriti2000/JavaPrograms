import java.io.*;
public class hcf {
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i,m,n,p,h,l;
        h=0;l=0;

        System.out.println("Enter two numbers.");
        m=Integer.parseInt(in.readLine());
        n=Integer.parseInt(in.readLine());
        p=m*n;
        for(i=1;i<p;i++){
            if(m%i==0 && n%i==0){
                h=i;
            }
        }
        System.out.println("The G.C.D="+h);
    }
}
