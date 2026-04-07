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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(preorder[0]);
        int rind=-1;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                rind=i;
                break;
            }
        }
        int[] lpo=Arrays.copyOfRange(preorder,1,rind+1);
        int[] lio=Arrays.copyOfRange(inorder,0,rind);
        root.left=buildTree(lpo,lio);

        int[] rpo=Arrays.copyOfRange(preorder,rind+1,preorder.length);
        int[] rio=Arrays.copyOfRange(inorder,rind+1,inorder.length);
        root.right=buildTree(rpo,rio);

        return root;
    }
}
