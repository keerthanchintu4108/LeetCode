import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // use set to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // convert set to list
        List<Integer> list = new ArrayList<>(set);
        // sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        // if size >= 3 return 3rd max
        if (list.size() >= 3) {
            return list.get(2);
        } else {
            return list.get(0); // return max
        }
    }
}