import java.util.*;
public class Series2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a and n");
        int a,i,n;
        double s=0;
        a=in.nextInt();
        n=in.nextInt();

        for(i=1;i<=n;i++)
            s=s+(double)a/(i+1);
        System.out.println("Sum of the series is:"+s);
    }
}
