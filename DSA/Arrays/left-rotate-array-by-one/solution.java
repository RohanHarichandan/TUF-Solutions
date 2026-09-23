class Solution {

    static void revArr(int arr[],int i,int j){
       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
    }
    public void rotateArrayByOne(int[] nums) {
        
        int n=nums.length;
        if(n<=1)return;

        revArr(nums,0,0);
        revArr(nums,1,n-1);
        revArr(nums,0,n-1);
    }
}