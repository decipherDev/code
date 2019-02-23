class Solution {
    public int maxSubArray(int[] nums) {
        int maximumSum=Integer.MIN_VALUE, sum=0;
        for (int i=0 ; i < nums.length; i++) {
	    sum += nums[i]; 
	    sum = sum > nums[i] ? sum : nums[i];
	    maximumSum = maximumSum > sum ? maximumSum : sum;
	}
        return maximumSum;
    }
}