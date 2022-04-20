package com.hashmap.binary;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("{"+"Key = ").append(key).append('}');

        if(left != null) {
            myNodeString.append("->").append(left);
        }
        if(right != null) {
            myNodeString.append("->").append(right);
        }
        return myNodeString.toString();
    }
}
