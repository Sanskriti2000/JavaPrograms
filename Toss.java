import java.io.*;
public class Toss {
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int i,c,h=0,t=0;
        double d;

        for(i=1;i<=20;i++){
            d=Math.random()*2;
            c=(int)d;

            if(c==1)
            h=h+1;
            else
            t=t+1;
        }
        System.out.println("Number of times Head is Obtained="+h);
        System.out.println("Number of times Tail is Obatined="+t);
    }
}
