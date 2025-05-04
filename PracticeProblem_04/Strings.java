package PracticeProblem_04;

public class Strings {
    public static boolean palindrome(String x, String y){
        boolean isPalindrome = false;
        if(x.equals(y)) isPalindrome = true;

        return isPalindrome;
    }

    public static int occurrence(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = new String("TENET");
        System.out.println("Original String : " + str);

        String rts = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String : " + rts);

        if(palindrome(str, rts))
            System.out.println("This String is Palindrome");
        else
            System.out.println("This String is not Palindrome");

        int count = occurrence(str, 'T');
        System.out.println("Occurrence of character 'T' is : " + count);
    }
}
