class Solution {
    public int[] applyOperations(int[] nums) {
         for(int i=1;i<nums.length;i++){
        if(nums[i-1]==nums[i]){
            nums[i-1]=nums[i]*2;
            nums[i]=0;
        }
    }
    System.out.println(nums);
    for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length-i;j++){
            if(nums[j-1]==0&&nums[j-1]<nums[j]){
            int temp=nums[j-1];
            nums[j-1]=nums[j];
            nums[j]=temp;
            }
        }
    }
    return nums;
    }
}