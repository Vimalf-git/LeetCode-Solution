class Solution {
    public int climbStairs(int n) {
        int[] temp=new int[n+1];
       if(n==1) return 1;
       if(n==2) return 2;
       temp[0]=1;
        temp[1]=1;
        temp[2]=2;
        
        
for(int i=3;i<=n;i++){
            temp[i]=temp[i-1]+temp[i-2];
        }
        return temp[n];
    }
}
