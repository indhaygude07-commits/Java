import java.util.Scanner;

class reversestr{

    String revstring(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
                       
        }
        return r;

    }


    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("enter the string you want reverse");
        String s1=sc.nextLine();
        sc.close();
        reversestr obj =new reversestr();
        System.out.println("your given String : "+s1);
        System.out.println("reversed string : "+obj.revstring(s1));
        


    }
}