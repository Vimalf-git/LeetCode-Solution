/* Problem solved in both java and JavaScript**/




// <!-- JavaScript -->

var applyOperations = function(nums) {

    for(let i=0;i<nums.length;i++){
        if(nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
        }
    }
    console.log(nums)
    for(let i=0;i<nums.length;i++){
        for(let j=0;j<nums.length-i;j++){
            if(nums[j]==0&&nums[j]<nums[j+1]){
            let temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
            }
        }

    }
    return nums
};