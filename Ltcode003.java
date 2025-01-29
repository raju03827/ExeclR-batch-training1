public class Ltcode003 {
        public int myAtoi(String s) {
            // Step 1: Ignore leading whitespace
            int index = 0;
            int n = s.length();
            while (index < n && s.charAt(index) == ' ') {
                index++;
            }
    
            // Step 2: Determine the sign
            int sign = 1; // Default is positive
            if (index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
                if (s.charAt(index) == '-') {
                    sign = -1;
                }
                index++;
            }
    
            // Step 3: Convert the number and skip leading zeros
            int result = 0;
            while (index < n && Character.isDigit(s.charAt(index))) {
                int digit = s.charAt(index) - '0'; // Convert char to int
    
                // Step 4: Check for overflow/underflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
    
                result = result * 10 + digit;
                index++;
            }
    
            return result * sign;
        }
    
        public static void main(String[] args) {
            Ltcode003 solution = new Ltcode003();
            
            // Test cases
            System.out.println(solution.myAtoi("42"));            // Output: 42
            System.out.println(solution.myAtoi("   -42"));        // Output: -42
            System.out.println(solution.myAtoi("4193 with words")); // Output: 4193
            System.out.println(solution.myAtoi("words and 987")); // Output: 0
            System.out.println(solution.myAtoi("-91283472332"));  // Output: -2147483648 (Integer.MIN_VALUE)
            System.out.println(solution.myAtoi("91283472332"));   // Output: 2147483647 (Integer.MAX_VALUE)
        }
    }

