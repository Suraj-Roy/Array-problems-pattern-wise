class Solution {
    public int trap(int[] height) {
        int result = 0;

        int fwd[] = new int[height.length];
        int bwd[] = new int[height.length];

        int temp = height[0];
        //Max at forwardpass
        for(int i=0;i<height.length;i++){
            fwd[i] = Math.max(temp,height[i]);
            temp = fwd[i];
        } 

        temp = height[height.length-1];
        //Max at backwardPass
         for(int i=height.length-1;i>=0;i--){
            bwd[i] = Math.max(temp,height[i]);
            temp=bwd[i];
        } 

        for(int i=0;i<height.length;i++){
            result += (Math.min(fwd[i],bwd[i]) > height[i]) 
                            ? Math.min(fwd[i],bwd[i]) - height[i] 
                            : 0;
        } 

        return result;

    }
}