class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        inhelper(root,ll);
        
        return ll;
        
        
    }
     public void inhelper(TreeNode root, List<Integer> ll ){
        
        
        if(root==null){
        return ;
        }
        
        inhelper(root.left,ll);
       
        inhelper(root.right,ll);
          ll.add(root.val);
        
    }
}