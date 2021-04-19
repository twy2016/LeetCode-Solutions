package tree;

/**
 * 相同的树
 *
 * @author gongpeng
 * @date 2021/4/19 22:41
 */
public class No100 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        solution.isSameTree(p, q);
    }

    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p != null && q != null && p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {
                return false;
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
