class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        prehelper(root,ll);
        
        return ll;
        
    }
    
     public void prehelper(TreeNode root, List<Integer> ll ){
        
        
        if(root==null){
        return ;
        }
        ll.add(root.val);
        prehelper(root.left,ll);
        prehelper(root.right,ll);
        
    }
}