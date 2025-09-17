import java.util.*;

public class anagram {
    public static void main(String[] args) {
     
        String s1="fdf";
        String s2="dff";
        char[] s3=s1.toCharArray();
        char[] s4=s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        String s5= new String(s3);
        String s6= new String(s4);
        
        if(s5.length()==s6.length()){
        if(s5.equals(s6)){
            System.out.println("it is anagram");

        }else{ 
           
            System.out.println("it is not a anagram");
        }
       }else{
        System.out.println("it is not a anagram");
       }
    }
}