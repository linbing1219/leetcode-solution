package TwoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[] {i, map.get(value)};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("no two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[] {1, 3, 5, 7};
        int[] res = twoSum.twoSum(nums, 8);
        for (int value : res) {
            System.out.println(value);
        }
    }
}

