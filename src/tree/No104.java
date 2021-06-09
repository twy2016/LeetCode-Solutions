package tree;

/**
 * 二叉树的最大深度
 *
 * @author gongpeng
 * @date 2021/6/9 13:08
 */
public class No104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(17)));
        Solution solution = new Solution();
        solution.maxDepth(root);
    }

    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int lLen = maxDepth(root.left);
            int rLen = maxDepth(root.right);
            return Math.max(lLen, rLen) + 1;
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
