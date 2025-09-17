class Main {
    public static void main(String [] args){
        int arr1[]={56,78,8,4,2,3};
        int element= 5;
        int foundelement=-1;


        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==element){
                foundelement=i;
                break;
             }
        }
        if(foundelement==-1){
            System.out.println("element not found in array");
        }else{
            System.out.println("element found in array at "+foundelement+"th position");
        }
    }
    
}