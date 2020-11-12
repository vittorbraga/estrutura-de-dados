/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.Tree;

/**
 *
 * @author vittor
 */
public class BinaryTree {
    TreeNode root = null;
    
    public void insert(int key) {
        if(this.root == null) {
            TreeNode node = new TreeNode();
            node.element = key;
            this.root = node;
        }else {
            this.insertNode(this.root, key);
        }
    }
    private void insertNode(TreeNode node, int key) {
        if(key < node.element) {
            if(node.left == null) {
                TreeNode newNode = new TreeNode();
                newNode.element = key;
                node.left = newNode;
            }else {
                this.insertNode(node.left, key);
            }
        }else {
            if(node.right == null) {
                TreeNode newNode = new TreeNode();
                newNode.element = key;
                node.right = newNode;
            }else {
                this.insertNode(node.right, key);
            }
        }
    }
        
    public void inOrderTraverse() {
        this.inOrderTraverseNode(this.root);
    }
    private void inOrderTraverseNode(TreeNode node) {
        if(node != null) {
            this.inOrderTraverseNode(node.left);
            System.out.println(node.element);
            this.inOrderTraverseNode(node.right);
        }
    }
    
    public void preOrderTraverse() {
        this.preOrderTraverseNode(this.root);
    }
    private void preOrderTraverseNode(TreeNode node) {
        if(node != null) {
            System.out.println(node.element);
            this.preOrderTraverseNode(node.left);
            this.preOrderTraverseNode(node.right);
        }
    }
   
    public void postOrderTraverse() {
        this.postOrderTraverseNode(this.root);
    }
    private void postOrderTraverseNode(TreeNode node) {
        if(node != null) {
            this.postOrderTraverseNode(node.left);
            this.postOrderTraverseNode(node.right);
            System.out.println(node.element);
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
    
    public TreeNode search(int key) {
        return this.searchNode(this.root, key);
    }
    private TreeNode searchNode(TreeNode node, int key) {
        if(node == null) {
            return null;
        }
        if(key < node.element) {
            return this.searchNode(node.left, key);
        }else if(key > node.element) {
            return this.searchNode(node.right, key);
        }else {
            return node;
        }
    }
    
    public TreeNode remove(int key) {
        return removeNode(this.root, key);
    }
            
    private TreeNode removeNode(TreeNode node, int key) {
        if(node == null) {
            return null;
        }
        if(key < node.element) {
            node.left = this.removeNode(node.left, key);
            return node;
        }else if(key > node.element) {
            node.right = this.removeNode(node.right, key);
            return node;
        }else {
            //caso 1
            if(node.left == null && node.right == null) {
                node = null;
                return node;
            }
            //caso 2
            if(node.left == null) {
                node = node.right;
                return node;
            }else if(node.right == null) {
                node = node.left;
                return node;
            }
            //caso 3
            TreeNode aux = this.minNode(node.right);
            node.element = aux.element;
            node.right = this.removeNode(node.right, aux.element);
            return node;
        }
    }
}
