class Solution {
    public double averageOfArray(int[] nums) {
        // Your code goes here
        float sum=0.0f;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum/n;
    }
}