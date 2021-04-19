package array;

/**
 * 加一
 *
 * @author gongpeng
 * @date 2021/4/19 23:50
 */
public class No66 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ints = plusOne(arr);
        System.out.println(ints);
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        boolean flag = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                flag = false;
                break;
            }
        }
        if (flag) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return add(digits, length);
        }

    }

    public static int[] add(int[] digits, int length) {
        int result = digits[length] + 1;
        if (result == 10) {
            digits[length] = 0;
            length--;
            add(digits, length);
        } else {
            digits[length] = result;
        }
        return digits;
    }
}
