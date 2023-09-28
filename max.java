// assigning 10 different integers in the S.D.A, and displaying the greatest number of the elements
public class max {
    public static void main(String args[]){
        int i, max; max=0;
        int m[]={1,39,52,45,65,85,74,23,14,10};

        for(i=0; i<10; i++){
           if(m[i]>max)
               max=m[i];
        }
        System.out.println("The greatest of the array elements: "+max);
    }
}
