class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length==1) return nums[0]*1.0/k;

        //k = k%nums.length;

       double res = Double.NEGATIVE_INFINITY;

       for(int i=0;i<=nums.length-k;i++){
        int start = i;
        int sum = 0;
        while(start<i+k){
            sum += nums[start++];
        }
        res = Math.max((sum*1.0)/k,res);
       }

       return res;
    }
}