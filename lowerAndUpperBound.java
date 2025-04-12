class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] ans = new int[2];
        ans[0] = lowerbound(nums, t);
        ans[1] = upperbound(nums, t);
        return ans;
    }

    public int lowerbound(int[] nums, int t) {
        int l = 0, r = nums.length - 1;
        int res = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > t) {
                r = mid - 1;
            } else if (nums[mid] == t) {
                res = mid;
                r = mid - 1; 
            } else {
                l = mid + 1;
            }
        }

        return res;
    }

    public int upperbound(int[] nums, int t) {
        int l = 0, r = nums.length - 1;
        int res = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > t) {
                r = mid - 1;
            } else if (nums[mid] == t) {
                res = mid;
                l = mid + 1; 
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}
