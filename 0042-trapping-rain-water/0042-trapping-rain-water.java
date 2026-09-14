class Solution {
    public int trap(int[] height) {
        int left=0;
        int maxleft=0;
        int right=height.length-1;
        int maxright=0;
        int water=0;
        while(left<right){
            if(height[left]<=height[right]){
                if (height[left]>=maxleft){
                    maxleft=height[left];
                }
                  else {
                    water=water+maxleft-height[left];
                }
                left++;
            } 
            else {
                if (height[right] >=maxright) {
                    maxright=height[right];
                } 
                else {
                    water=water+maxright-height[right];
                }
                right--;
            }
        }
        return water;
    }
}