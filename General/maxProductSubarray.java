class Solution {
    public int maxProduct(int[] nums) {
        int globalMax = nums[0];
        int localMax = 1;

        for(int i=0; i<nums.length; i++) {
            localMax = localMax*nums[i];
            globalMax =Math.max(localMax, globalMax);
            if(localMax==0)
                localMax=1;
        }

        localMax=1;
        for(int i=nums.length-1; i>=0; i--) {
            localMax = localMax*nums[i];
            globalMax =Math.max(localMax, globalMax);
            if(localMax==0)
                localMax=1;
        }

        return globalMax;
    }
}