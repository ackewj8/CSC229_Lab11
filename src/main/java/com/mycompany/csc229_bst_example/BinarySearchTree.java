package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }
    
    public void inOrderTraversal() {
        doInOrder(this.root);
    }
    
    public void preOrder(){
        preOrderTraversal(this.root);
    }

    public void doInOrder(BstNode root) {

        // ToDo 1: complete InOrder Traversal
        if(root==null)
            return;
        doInOrder(root.getLeft());
        System.out.println(root.getData());
        doInOrder(root.getRight());
        
    }
        public void preOrderTraversal(BstNode root) {
        if(root==null) {
            return;
        }
        System.out.println(root.getData());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
        // ToDo 2: complete the pre-order travesal . 
    }
        
    public Integer findHeight(BstNode h) {

        // ToDo 3: Find the height of a tree
        int height=0;
        if(this.root==null)
            height=-1;
        return height;
    }

    public int getDepth(BstNode root, int a) {
        //ToDo 4: complete getDepth of a node 
        int depth=0;
        if(root==null)
            return -1;
        if(Objects.equals(root.getData(), this.root.getData())){ // The root's depth is zero
            depth=0;
        }
        else{
            depth++;
            if(n.getData()>root.getData()){
                depth=getDepth(root.getRight(),a+1);
            }
        }
        System.out.println(root.getData());
        return depth;
    }
    
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
       print("", root, false);
       
       
       
        // ToDo 5: complete the print of the BST
    }


}
