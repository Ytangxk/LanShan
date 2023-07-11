package no1.algorithm;
import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName Solu1
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 19:32
 * @Version 1.0
 **/
public class Solu1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        Solu1 solu1 = new Solu1();
        int[] nums_1 = {2, 7, 11, 5};
        int target_1 = 9;
        int[] res = solu1.twoSum(nums_1,target_1);
        for(int i=0;i<2;i++){
            System.out.println(res[i]);
        }
    }
}

