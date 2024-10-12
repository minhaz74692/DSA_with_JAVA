class PalindromeString {
    public static void main(String args[]) {
       boolean isPalindrome =   isPalindrome("hhh");
       System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!isAlphanumeric(s.charAt(left))) {
                ++left;
            } else if (!isAlphanumeric(s.charAt(right))) {
                --right;
            } else if (toLower(s.charAt(left)) != toLower(s.charAt(right))) {
                return false;
            } else {
                ++left;
                --right;
            }
        }
        return true;
    }

   public static boolean isAlphanumeric(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public static int toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - ('A' - 'a');
        } else {
            return c;
        }
    }
}