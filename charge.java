import java.io.*;
public class charge {
    public static void main(String args[])throws IOException {
        int w, c = 0;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter weight of parcel=");
        w = Integer.parseInt(in.readLine());

        if (w <= 10)
            c = w * 20;
        if ((w > 10) && (w <= 30))
            c = 200 + (w - 10) * 10;
        if((w>30) && (w<=50))
            c = 200+200+(w-30)*8;
        if(w>50)
            c = 200+200+160+(w-50)*5;

        System.out.println("The weight of the parcel="+w);
        System.out.println("The charge of the parcel="+c);
    }
}
