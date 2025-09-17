class binarysearch{

	int binarysearch1(int [] a,int key){
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(key==a[mid]){
				return mid;
			}else if (key<a[mid] ){
				high=mid-1;
			}else{
				low=mid+1;
			}
		
		
		}
	
		return -1;	
	}

	int []  sort(int [] a){
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



	public static void main(String[] args){
	
	
	int[] arr1={20,1,4,5,6,8,9,10,12,15,17,19};
	
	int element=12;
	binarysearch obj=new binarysearch();
	
	System.out.println(obj.binarysearch1(obj.sort(arr1),element));

	
	
	
	}








}