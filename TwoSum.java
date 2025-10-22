import java.util.*;

class TwoSum {

    public static void main(String[] args) {
        int[] arr = twoSum(new int[] { 1, 3,4,5,1,1 }, 10);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (h1.containsKey(diff)) {
                return new int[] { h1.get(diff), i };
            } else {
                h1.put(nums[i], i);
            }
        }
        return new int[] {};

    }
}
