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
    List<List<Integer>> ml=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        getList(root,0);
        return ml;
    }
    public void getList(TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(ml.size()==depth){
            ml.add(new ArrayList<>());
        }
        ml.get(depth).add(root.val);
        getList(root.left,depth+1);
        getList(root.right,depth+1);
    }
}
