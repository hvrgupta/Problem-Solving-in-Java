public class stringPalindrome {

    public static boolean checkPalindrome(String s, int i) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        if (i >= s.length() / 2)
            return true;

        return checkPalindrome(s, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abaaba", 0));
    }
}