package estruturadedados;

public class BinaryTree {
	TreeNode root = null;
	
	public void insert(int element) {
        if(this.root == null) {
            TreeNode node = new TreeNode();
            node.element = element;
            this.root = node;
        }else {
            this.insertNode(this.root, element);
        }
    }
    private void insertNode(TreeNode node, int element) {
        if(element < node.element) {
            if(node.left == null) {
                TreeNode newNode = new TreeNode();
                newNode.element = element;
                node.left = newNode;
            }else {
                this.insertNode(node.left, element);
            }
        }else {
            if(node.right == null) {
                TreeNode newNode = new TreeNode();
                newNode.element = element;
                node.right = newNode;
            }else {
                this.insertNode(node.right, element);
            }
        }
    }
    
    public TreeNode min() {
        return this.minNode(this.root);
    }
    private TreeNode minNode(TreeNode node) {
        TreeNode current = node;
        while(current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }
   
    public TreeNode max() {
        return this.maxNode(this.root);
    }
    private TreeNode maxNode(TreeNode node) {
        TreeNode current = node;
        while(current != null && current.right != null) {
            current = current.right;
        }
        return current;
    }
}
