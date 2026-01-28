
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> collectLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        /**
         * Iterate through the Binary tree and keep on collecting leaves until the 
         * root itself is null
         */
        while (root != null) {
            /**
             * This provides us leaves, level by level
             */
            List<Integer> leaves = new ArrayList<>();
            root = removeLeaves(root, leaves);
            result.add(leaves);
        }
        return result;
    }
    
    private TreeNode removeLeaves(TreeNode node, List<Integer> leaves) {
        /**
         * Base condition
         */
        if (node == null) {
            return null;
        }
        /**
         * Another base condition
         */
        if(node.left==null && node.right==null){
            /**
             * Add it to the list of leaves for this level
             */
            leaves.add(node.val);
            /**
             * remove the last leaf
             */
            return null;
        }
        node.left=removeLeaves(node.left, leaves);
        node.right=removeLeaves(node.right, leaves);
        /**
         * return the updated tree
         */
        return node;
    }
}
