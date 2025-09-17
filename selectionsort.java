import java.util.Arrays;

class selectionsort {
    int []selectionsort1(int[] a){
        int n=a.length;
		for(int i=0;i<n-1;i++){
		int minindex=i;
		for(int j=i+1;j<n;j++){
		
			if(a[j]<a[minindex]){
				minindex=j;
			}
		}
		int temp=a[minindex];
		a[minindex]=a[i];
		a[i]=temp;
		}
		return a;

    }
    
    public static void main(String[] args) {
        int[] arr={1,5,8,4,2,3,9,10};
        selectionsort obj= new selectionsort();
        System.out.println(Arrays.toString(obj.selectionsort1(arr)));

        
    }
}
