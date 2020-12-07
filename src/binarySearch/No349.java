package binarySearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @author gongpeng
 * @date 2020/12/7 9:41
 */
public class No349 {

    /**
     * 直接两个for循环遍历
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
                    list.add(nums1[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * 通过set去重
     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                resSet.add(nums2[j]);
            }
        }
        int[] result = new int[resSet.size()];
        int indxe = 0;
        for (Integer num : resSet) {
            result[indxe++] = num;
        }
        return result;
    }
}
