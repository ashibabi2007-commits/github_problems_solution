class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int left=0;
     int m=nums1.length;
     int n=nums2.length;
     int[] arr=new int[m+n];
     for (int i=0;i<m;i++){
        arr[i]=nums1[i];
     }
     while (left<n){
        arr[m+left]=nums2[left];
        left++;
     }  
    Arrays.sort(arr);
    int medi=0;
    int medi2=0;
    if (arr.length%2==0){
        medi=arr[(arr.length/2)-1];
        medi2=arr[(arr.length/2)];
        return (medi+medi2)/2.0;
    }
    else{
        medi=arr[(arr.length)/2];
        return medi;
    }
    }

}