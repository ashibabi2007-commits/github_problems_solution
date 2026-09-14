class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right];
            }
            right++;
        }
        return left+1;
    }
}