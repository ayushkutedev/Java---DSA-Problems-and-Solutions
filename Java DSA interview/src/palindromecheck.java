public class palindromecheck {
    public static void main(String args[]){
        String str = "XOX";

        boolean isPalindrome =  checkpalindrome(str);
        System.out.println(str + " is Palindrome ? " + isPalindrome);
    }

    static boolean checkpalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}



