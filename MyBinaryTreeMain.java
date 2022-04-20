package com.hashmap.binary;

public class MyBinaryTreeMain {
        public static void main(String[] args) {

            System.out.println("------ Welcome to Data Structure : Binary Search Tree ------");

            MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
            myBinaryTree.add(56);
            myBinaryTree.add(30);
            myBinaryTree.add(70);

            myBinaryTree.printBinaryTree();
        }
}

		

