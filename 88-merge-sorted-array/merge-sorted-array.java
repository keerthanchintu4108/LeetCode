class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i, j = 0;

        // copy nums2 elements into nums1
        for(i = m; i < m + n; i++){
            nums1[i] = nums2[j];
            j++;
        }

        // simple sorting
        for(i = 0; i < m + n; i++){
            for(j = i + 1; j < m + n; j++){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}