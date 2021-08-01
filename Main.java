package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree a = new BinaryTree();
        Node root = null;

        root = a.insert(root,10 );
        root = a.insert(root,5 );
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 2);
        root = a.insert(root, 7);
        root = a.insert(root, 11);
        root = a.insert(root, 20);
        root = a.insert(root, 15);


        System.out.println("The Height of the New Binary Tree is :"+a.calMaxHeight(a.insert( a.createdNewNode(9) , 15)));

        System.out.println("The Height of the Inserted binary is :"+a.calMaxHeight(root));

    }
}
N