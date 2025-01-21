class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ll = new ArrayList<>();
        inhelper(root,ll);
        
        return ll;
        
        
    }
    
    public void inhelper(TreeNode root, List<Integer> ll ){
        
        
        if(root==null){
        return ;
        }
        
        inhelper(root.left,ll);
        ll.add(root.val);
        inhelper(root.right,ll);
        
    }
}