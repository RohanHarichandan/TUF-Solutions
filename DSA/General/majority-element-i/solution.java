class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> ll=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(ll.containsKey(nums[i])){
                int count=ll.get(nums[i]);
                ll.put(nums[i],count+1);
            }
            else {
                ll.put(nums[i],1);
            }
            if(ll.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}