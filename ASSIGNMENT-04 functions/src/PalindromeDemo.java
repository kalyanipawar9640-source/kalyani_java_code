
//14. Write a recursive method that checks whether a string is palindrome.

class PalindromeDemo {
    static boolean isPalindrome(String str) {
        if (str.length() <= 1)
            return true;

        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;

        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));
    }
}