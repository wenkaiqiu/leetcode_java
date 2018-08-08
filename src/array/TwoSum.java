// #1
package array;

import java.util.HashMap;
import java.util.Map;


/**
 * @author qwk
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map exit = new HashMap();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int d = nums[i];
            // 判断自己是否被需要过
            if (!exit.containsKey(d)) {
                exit.put(target - d, i);
            } else {
                result[0] = (int) exit.get(d);
                result[1] = i;
            }
        }
        return result;
    }
}
