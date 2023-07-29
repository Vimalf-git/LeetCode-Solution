class Solution {
    public int minCostClimbingStairs(int[] cost) {
       

           for(int i=2;i<cost.length;i++){ //1st Method
               
               /** 1st iteration to store
               cost[2] =cost[2] +(100,1);
               cost[2] =1+1; => 2;
               

                */
             
            cost[i] +=Math.min(cost[i-2],cost[i-1]);

           }
           return Math.min(cost[cost.length-2],cost[cost.length-1]);



           //Second Mrthod
           /*for(int i=cost.length-2;i>=0;i--){
                if(i==cost.length-2){
                  cost[i] =Math.min(cost[i],cost[i]+cost[i+1]);
                }else{
               cost[i] +=Math.min(cost[i+2],cost[i+1]);
                }
            }*/
    }
}
