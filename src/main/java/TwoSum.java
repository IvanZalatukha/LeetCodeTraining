import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 7)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            Integer secondIndex = map.get(val);
            if (secondIndex != null && secondIndex != i) {
                result[0] = i;
                result[1] = secondIndex;
                return result;
            }
        }
        return result;
    }
}
