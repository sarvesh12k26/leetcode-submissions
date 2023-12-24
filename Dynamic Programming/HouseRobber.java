class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        else if(n==2)
            return Math.max(nums[0], nums[1]);

        int prevPrev=0, prev=0, curr=0;

        prevPrev = nums[0];
        prev = Math.max(prevPrev, nums[1]);

        for(int i=2; i<n; i++) {
            curr = Math.max((prevPrev + nums[i]) , prev);
            prevPrev = prev;
            prev = curr;
        }
        return curr;
    }
}