package binarySearch;

/**
 * 统计有序矩阵中的负数
 *
 * @author gongpeng
 * @date 2020/12/7 9:27
 */
public class No1351 {

    /**
     * 双层for循环遍历，遍历到负数时，后续数字也为负数
     *
     * @param grid
     * @return
     */
    public static int countNegatives(int[][] grid) {
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] >= 0) {
                    continue;
                } else {
                    index += grid[i].length - j;
                    break;
                }
            }
        }
        return index;
    }
}
