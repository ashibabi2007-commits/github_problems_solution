class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (right + 1 < nums.length && nums[left] == nums[right] && nums[right] == nums[right + 1]) {
                left = left + 3;
                right = right + 3;
            }
            else {
                return nums[left];
            }
        }

        return nums[left];
    }
}