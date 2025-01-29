public class Ltcode001{
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        
        return original == reversed;
    }

    public static void main(String[] args) {
        Ltcode001 Ltcode001= new Ltcode001();

        
        System.out.println("Is 121 a palindrome? " + Ltcode001.isPalindrome(121)); // true
        System.out.println("Is -121 a palindrome? " + Ltcode001.isPalindrome(-121)); // false
        System.out.println("Is 10 a palindrome? " + Ltcode001.isPalindrome(10)); // false
        System.out.println("Is 0 a palindrome? " + Ltcode001.isPalindrome(0)); // true
    }
}