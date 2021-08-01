package com.company;


public class BinaryTree {

    public Node createdNewNode(int k){
        Node a = new Node();
        a.data =k;
        a.left =null;
        a.right =null;
        return a;
    }
    public Node insert(Node node, int val) {
        if (node == null){
            return createdNewNode(val);
        }
        if (val < node.data){
            node.left = insert(node.left ,val);
        } else if(val > node.data){
            node.right = insert(node.right ,val);
        }
        return node;

    }
    public int calMaxHeight(Node root){
        if (root==null)
            return -1;
        int lefth = calMaxHeight(root.left);
        int righth = calMaxHeight(root.right);
        if(lefth>righth){
            return lefth+1;
        }
        return righth+1;
    }
}