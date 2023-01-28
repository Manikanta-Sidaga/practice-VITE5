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
        Queue<TreeNode> que= new LinkedList<>();
        List<List<Integer>> res= new ArrayList<> ();
        List<List<Integer>> fin= new ArrayList<> ();
        List<Integer> li= new ArrayList<> ();
        if(root==null)
        return res;
        que.add(root);
        li.add(root.val);
        res.add(li);
        while(!que.isEmpty()){
            li = new ArrayList<Integer>();
            int size= que.size();
            for(int i=1;i<=size;i++){
                TreeNode curr= que.poll();
                if(curr.left!=null){
                    que.add(curr.left);
                    li.add(curr.left.val);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                    li.add(curr.right.val);
                }
            }
            if(!li.isEmpty())
            res.add(li);
        }
        return res;

    }
}
