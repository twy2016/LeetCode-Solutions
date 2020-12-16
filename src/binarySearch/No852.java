package binarySearch;

/**
 * 山脉数组的峰顶索引
 * 其实就是求最大值的下标
 *
 * @author gongpeng
 * @date 2020/12/15 11:03
 */
public class No852 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return arr.length - 1;
    }
}
