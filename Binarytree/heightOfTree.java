class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max1=0;
        int max2=0;

       max1= maxDepth(root.left);
       max2= maxDepth(root.right);

  return Math.max(max1,max2)+1;
        
    }
}