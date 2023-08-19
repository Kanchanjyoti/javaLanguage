import java.util.*;
public class StringExercise{

    // counting lowercase vowels 
    public static int countingVowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a'){
                count++;

            } 
             if(str.charAt(i)== 'e'){
                count++;

            }  if(str.charAt(i)== 'i'){
                count++;

            }  if(str.charAt(i)== 'o'){
                count++;

            }  if(str.charAt(i)== 'u'){
                count++;

            } 
        }
            return count;
    }

    // function for anagram 
    

        
    
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         String str= sc.nextLine();
         System.out.println("The total number of vowels in entered string is "+ countingVowel(str));

        //   Generating the output 
        String st= "Kanchan Jyoti";
        String st1= "Hello World";
        String st2= "Kanchan Jyoti";
        System.out.println(st.equals(st1)+" "+ st.equals(st2));

        String st3= "kenchan".replace("e","a");
        System.out.println(st3);

        // Checking whether two strings are anagram or not
        String s1= "race"; String s2= "care";
        // System.out.println(isAnagram(s1,s2));
    }
}