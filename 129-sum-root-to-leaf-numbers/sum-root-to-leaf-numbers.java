class Solution {

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode node, int path) {
        if(node == null) return;

        // Build number from path
        path = path * 10 + node.val;

        // If leaf node, add to sum
        if(node.left == null && node.right == null) {
            sum += path;
        }

        // Traverse left and right
        helper(node.left, path);
        helper(node.right, path);
    }
}