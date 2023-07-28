import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDiff=0;
        if(nums.length<2){
            return 0;
        }
        else{
            for(int i=0;i<nums.length-1;i++){
                int diff=nums[i]-nums[i+1];
              int d=  Math.abs(diff);
                if(d>maxDiff){
                    maxDiff=d;
                }
            }
            return maxDiff;
        }
    }
    
}
