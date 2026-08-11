 Q. Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Code =    class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for (int num:nums)
        {
            if (myset.contains(num)) {
                return true;
            } else {
                myset.add(num);
            }
        }
        return false;
    }
}
