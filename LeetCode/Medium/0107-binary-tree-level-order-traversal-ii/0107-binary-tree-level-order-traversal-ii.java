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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null){
            return res;
        }
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        
        while(!queue.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            int level = queue.size();   

            for(int i = 0; i < level; i++){
                TreeNode curr = queue.pollFirst();
                currLevel.add(curr.val);
                
                if(curr.left != null){
                    queue.offerLast(curr.left);
                }
                if(curr.right != null){
                    queue.offerLast(curr.right);
                }
            }
            res.addFirst(currLevel);
        }
        return res;
    }
}