class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isUnique(nums, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean isUnique(int[] nums, int len) {

        Map<Long, Integer> map = new HashMap<>();

        long base = 1000003;
        long hash = 0;
        long power = 1;

        // hash of first window
        for (int i = 0; i < len; i++) {
            hash = hash * base + nums[i];
        }

        map.put(hash, 1);

        // base^(len-1)
        for (int i = 1; i < len; i++) {
            power *= base;
        }

        // Sliding window
        for (int i = len; i < nums.length; i++) {

            hash -= nums[i - len] * power;
            hash = hash * base + nums[i];

            map.put(hash, map.getOrDefault(hash, 0) + 1);
        }

        // Check whether any subarray occurs exactly once
        for (int count : map.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}