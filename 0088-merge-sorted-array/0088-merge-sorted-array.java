class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right=0;
        while (right<n){
            if(nums2[right]!=0){
                nums1[m]=nums2[right];
                m++;
            }
            right++;
        }
        Arrays.sort(nums1);
    }
}