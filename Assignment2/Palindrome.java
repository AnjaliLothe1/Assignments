package Assignment2;

public class Palindrome {
	 
    public static void main(String[] args) {
        int num = 121
        int rev = Integer.parseInt((new StringBuilder(num+"")).reverse().toString());
        if(num==rev) {
            System.out.println(num+" = Palindrome");
        } else {
            System.out.println(num+" = not Palindrome");
        }
    }
}
