public class Series4 {
    public static void main(String args[]){
        float a,s;
        s=0;
        for(a=1;a<=10;a++){
            if(a%2==0)
                s=s-a/(a+1);
            else
                s=s+a/(a+1);
        }
        System.out.println("The sum of the series= "+s);
    }
}
