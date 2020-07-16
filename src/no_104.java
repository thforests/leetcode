import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class no_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        Queue <TreeNode> queue = new LinkedList <TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return level;
    }
}