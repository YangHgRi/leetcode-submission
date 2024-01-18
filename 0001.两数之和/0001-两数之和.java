class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int iTemp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int jTemp = nums[j];
                int possible = iTemp + jTemp;
                if (possible == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[]{};
    }
}