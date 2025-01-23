import java.util.HashMap;

public class ltcode005 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found (though the problem guarantees one exists)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        ltcode005 solution = new ltcode005();

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]");
    }
}