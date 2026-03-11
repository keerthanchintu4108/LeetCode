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
        Set<Integer> intSet = new HashSet<>();

        for(int num:nums){
            if(intSet.contains(num))
            return true;
            intSet.add(num);
        }
        return false;
    }
}