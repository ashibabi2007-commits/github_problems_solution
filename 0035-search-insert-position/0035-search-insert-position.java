class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]>=target){
                return left;
            }
            left++;
        }
        return nums.length;
    }
}