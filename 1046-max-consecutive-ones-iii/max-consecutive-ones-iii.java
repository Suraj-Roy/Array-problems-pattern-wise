class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int count = 0;
            int temp = k;
           

            for(int j = i;j<nums.length;j++){
                if(nums[j]==1) count++;
                else if(nums[j]==0&&temp>0){
                    temp--;
                    count++;

                }
                else break;
            }

            res = Math.max(res,count);
        }

        return res;
    }
}