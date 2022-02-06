package com.datastructureassiginmentsolution.classes;

public class BSTMSC {
    public class Node {
        int value;
        int height;
        Node left;
        Node right;
    }

    public Node newNode(int value) {
        Node temp = new Node();
        
        temp.value = value;
        temp.height = 1;

        temp.left = null;
        temp.right = null;

        return temp;
    } 

    public Node makeDefaultTree() {
        Node tree = newNode(50);
        tree.left = newNode(30);
        tree.right = newNode(60);
        tree.left.left = newNode(10);
        tree.right.left = newNode(55);
        return tree;
    }

    public int getHeight(Node N) {
        if (N==null)
            return 0;
        return N.height;
    }

    public Node rightRotation(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        
        x.right = y;
        y.left = T2;

        y.height = (getHeight(y.left) > getHeight(y.right) ? getHeight(y.left) : getHeight(y.right) ) + 1; 
        x.height = (getHeight(x.left) > getHeight(x.right) ? getHeight(x.left) : getHeight(x.right) ) + 1;

        return x;
    }


    public Node leftRotation(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        
        y.left = x;
        x.right = T2;

        x.height = (getHeight(x.left) > getHeight(x.right) ? getHeight(x.left) : getHeight(x.right) ) + 1;
        y.height = (getHeight(y.left) > getHeight(y.right) ? getHeight(y.left) : getHeight(y.right) ) + 1; 

        return y;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        else {
            inOrder(root.left);
            System.out.print(root.value + "{" + root.height + "}" + " ");
            inOrder(root.right);
        }
    }

    public int getBalanceFactor(Node N) {
        if (N == null) 
            return 0;
        return getHeight(N.left) - getHeight(N.right);
    }
}
