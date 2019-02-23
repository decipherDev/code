/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Set<Integer> set = new HashSet<>();
    private boolean flag = false;
    public boolean findTarget(TreeNode root, int k) {     
        if(root == null) {
            return false;
        } 
        if(set.contains(root.val)) {flag=true;}
        else set.add(k-root.val); 
        findTarget(root.left, k); 
        findTarget(root.right, k);
        return flag;      
    }
}