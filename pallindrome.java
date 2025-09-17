class Main {

    public static void main(String [] args){
        String myString = "madam";
        char[] charArray = myString.toCharArray();
        int n=charArray.length;


        
        for (int i=0;i<=((n-1)/2); i++){
            if(charArray[i]!=charArray[n-1-i]){
                
                System.out.println("it is not a pallindrome");
                break;

            }else{
                if(i==(n-1)/2){
                    
                    System.out.println("it is a pallindrome");
                }
            }
        }
            
        
    
    
}

}