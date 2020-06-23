import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class no_144 {
    //二叉树的前序遍历
    //颜色标记法
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class ColorTree {
        private String color;
        private TreeNode node;

        public ColorTree(String color, TreeNode node) {
            this.color = color;
            this.node = node;
        }
    }

    public List <Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList <>();
        }

        List <Integer> res = new ArrayList <>();
        Stack <ColorTree> stack = new Stack <>();
        stack.push(new ColorTree("white", root));

        while (!stack.empty()) {
            ColorTree colorTree = stack.pop();
            if (colorTree.color.equals("white")) {
                if (colorTree.node.right != null)
                    stack.push(new ColorTree("white", colorTree.node.right));


                if (colorTree.node.left != null){
                    stack.push(new ColorTree("white", colorTree.node.left));
                }
                stack.push(new ColorTree("gray", colorTree.node));
            }else {
                res.add(colorTree.node.val);
            }
        }

        return res;

    }


}
