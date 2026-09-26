class Solution {
    public void sortZeroOneTwo(int[] nums) {
        
        int n=nums.length;
        int i=0;
        int j=n-1;
        int x=0;

        while(x<=j){
            if(nums[x]==0){
                nums[x]=nums[i];
                nums[i]=0;
                x++;
                i++;
            }
            else if(nums[x]==1){
                x++;
            }
            else{
                nums[x]=nums[j];
                nums[j]=2;
                
                j--;
            }
          
        }
    }
}