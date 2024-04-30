// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
      
        ans.addAll(postorderTraversal(root.left));
         
        ans.addAll(postorderTraversal(root.right));
        ans.add(root.val);
       return ans;
    }
}