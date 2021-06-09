package binarySearch;

/**
 * 面试题 08.03. 魔术索引
 *
 * @author gongpeng
 * @date 2020/12/17 9:36
 */
public class InterviewQuestions0803 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,3,5,5,5};
        System.out.println(findMagicIndex(arr));
    }

    public static int findMagicIndex(int[] nums) {
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (!flag) {
                result = i;
            }
            if (nums[i] == i) {
                if (result >= nums[i]) {
                    result = nums[i];
                }
                flag = true;
            }
        }
        if (flag) {
            return result;
        }
        return -1;
    }
}
