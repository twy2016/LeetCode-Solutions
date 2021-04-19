package tree;

/**
 * 对称二叉树
 *
 * @author gongpeng
 * @date 2021/4/19 22:41
 */
public class No101 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        Solution solution = new Solution();
        solution.isSymmetric(root);
    }

    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }

        /**
         * 这里在No100相同的树的方法上稍微修改了一下
         * @param p
         * @param q
         * @return
         */
        public boolean isMirror(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p != null && q != null && p.val == q.val) {
                return isMirror(p.left, q.right) && isMirror(p.right, q.left);
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
