public class Series1 {
    public static void main(String args[]){
        int a,s,p;
        s=0;p=1;
        for(a=1;a<=10;a++){
            p=p*a;
            s=s+p;
        }
        System.out.println("The Sum of the Series is="+s);
    }
}
