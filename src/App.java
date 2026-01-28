
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given a binary tree, collect a tree's nodes as if you were doing this: Collect and remove all leaves, repeat until the tree is empty.
        
        
        
        Example:
        
        Input: [1,2,3,4,5]
        
          1
         / \
        2   3
        / \
        4   5
        
        Output: [[4,5,3],[2],[1]]
        
        
        Explanation:
        
        1. Removing the leaves [4,5,3] would result in this tree:
        
          1
         /
        2
        
        
        2. Now removing the leaf [2] would result in this tree:
        
          1
        
        
        3. Now removing the leaf [1] would result in the empty tree:
        
          []
         */
        // Creating a test binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.collectLeaves(root);

        System.out.println("The leaf nodes collected for the binary tree constrcted above are: "+result);
    }
}
