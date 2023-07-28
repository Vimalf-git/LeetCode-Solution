class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int r=0;
    int local=x;
    while(x>0){
        r=x%10;
         sum=(sum*10)+r;
        x=x/10;
    }
    if(sum==local){
        return true;
    }
    else{
        return false;
    }
    }
}
