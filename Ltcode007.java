class Ltcode007{
    public int[] plusOne(int[] digits) {
       
        for (int i = digits.length - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }

       
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber; 
    }

    public static void main(String[] args) {
        Ltcode007 ltcode007 = new Ltcode007();

        
        int[] digits = {9, 9, 9};
        int[] result = ltcode007.plusOne(digits);

        
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num);
        }
    }
}