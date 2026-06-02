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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> tmp ;

        if(root != null){
            q.add(root);
            tmp = new ArrayList<>();
            tmp.add(root.val);
            res.add(tmp);
        }
        
        while(!q.isEmpty()){
            int size = q.size();
            tmp = new ArrayList<>();

            for(int i = 0; i<size; i++){
               TreeNode node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                    tmp.add(node.left.val);
                }
                if (node.right != null){
                    q.add(node.right);
                    tmp.add(node.right.val);
                }
            }
            if(tmp.size()!= 0){
                res.add(tmp);
            }
        }
        return res;
    }
}