
/*
Question
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:


Input: arr = [2,1]
Output: false

Input: arr = [0,3,2,1]
Output: true

Input: arr = [3,5,5]
Output: false
*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        boolean result=false;
if(arr.length<3){
    return false;
}else{
    while(i<arr.length-1 && arr[i]<arr[i+1]){
        i++;
    }
    if(i==0 || i==arr.length-1){
        return false;
    }
    while(i<arr.length-1 && arr[i+1]<arr[i]){
        i++;
    }

     
        return (i==arr.length-1);
}    }
}
