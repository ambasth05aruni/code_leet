class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Sum of numbers from 0 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        
        return expectedSum - actualSum;
    }
}
