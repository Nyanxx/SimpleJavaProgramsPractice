// Develop a function to check if a given string is a palindrome.

public class FuncPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("tenet"));

        System.out.println(isPalindrome("tenten"));
    }

    private static boolean isPalindrome(String text) {
        StringBuilder str = new StringBuilder(text.toLowerCase());
        str.reverse();
        return text.toLowerCase().contentEquals(str);
    }
}
