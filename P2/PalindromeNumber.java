class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(IsPalindromeNumber(121));
    }

    public static boolean IsPalindromeNumber(int x) {
        
        // Negative numbers and numbers ending in 0 (except 0) are not palindrome
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // Let's assume the reversedHalf is 0
        int reversedHalf = 0;

        // Runs until x is less than reversedHalf
        while(x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // returns true if x equals reversedHalf (even length) or x equals reversedHalf/10 (odd length)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}

