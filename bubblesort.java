import java.util.Arrays;

public class bubblesort {
   
    int [] bubblesort1(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;


    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,9,4,6,70,80,40};
        bubblesort obj=new bubblesort();
        System.out.println(Arrays.toString(obj.bubblesort1(arr)));
    }
    
}