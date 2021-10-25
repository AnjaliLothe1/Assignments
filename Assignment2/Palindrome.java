package Assignment2;

public class Palindrome {
	 
    public static void main(String[] args) {
         
        int n = 122321;
         
        //reverse the string
        int rev = Integer.parseInt((new StringBuilder(n+"")).reverse().toString());
         
        //check if n is palindrome
        if(n==rev) {
            System.out.println(n+" is Palindrome.");
        } else {
            System.out.println(n+" is not Palindrome.");
        }
    }
}
