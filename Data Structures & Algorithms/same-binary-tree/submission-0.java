/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> pStack = new ArrayDeque<>();
        Deque<TreeNode> qStack = new ArrayDeque<>();

        pStack.push(p);
        qStack.push(q);

        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if (pNode == null && qNode == null) continue;
            if (pNode == null || qNode == null) return false;
            if (pNode.val != qNode.val) return false;

            // Compare left structure
            if (pNode.left == null ^ qNode.left == null) {
                return false;
            }

            // Compare right structure
            if (pNode.right == null ^ qNode.right == null) {
                return false;
            }

            if (pNode.left != null) {
                pStack.push(pNode.left);
                qStack.push(qNode.left);
            }

            if (pNode.right != null) {
                pStack.push(pNode.right);
                qStack.push(qNode.right);
            }
        }

        return pStack.isEmpty() && qStack.isEmpty();
    }
}
