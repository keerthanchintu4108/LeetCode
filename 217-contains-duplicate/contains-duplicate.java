class Solution {
    public boolean containsDuplicate(int[] nums) {

        // for (int i = 0; i < nums.length; i++) {
        //     boolean isDuplicate = false;
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             isDuplicate = true;
        //             break;
        //         }
        //     }
        //     if (isDuplicate) {
        //         return true;
        //     }
        // }
        // return false;
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}