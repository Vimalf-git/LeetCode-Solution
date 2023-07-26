class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result1 = new int[2];
		for (int i = 0; i < nums.length; i++) {
            if(i!=nums.length-1){
			for (int j = i+1; j < nums.length; j++) {
				//int result = nums[i]+ nums[j];
				if ( nums[j] == (target-nums[i])) {
					 result1[0]=i;
                     result1[1]=j;
				}
			}
            }else{
                break;
            }
		}
		return result1;
    }
}
