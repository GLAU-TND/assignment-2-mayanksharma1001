/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    public static int noLeftCounter = 0;
    static int levels = 0;
    public TreeNode node;

    public MyBinarySearchTree() {
        this.node = null;
        preOrderString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderString.append(root.getKey() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void add(final int value) {
        this.node = addRecursive(value, this.node);
    }

    public TreeNode addRecursive(int value, TreeNode node) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.getKey()) {
            node.setLeft(addRecursive(value, node.getLeft()));
        } else {
            node.setRight(addRecursive(value, node.getRight()));
        }
        return node;
    }

    void printLeftChild(TreeNode treeNode, int level) {
        if (treeNode == null) {
            return;
        }
        if (levels < level) {
            if (treeNode.getLeft() == null) {
                noLeftCounter++;
            }
            System.out.print(" " + treeNode.getKey());
            levels = level;
        }
        printLeftChild(treeNode.getLeft(), level + 1);
        printLeftChild(treeNode.getRight(), level + 1);
    }

    public void printLeftChild() {
        printLeftChild(this.node, 1);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getKey() + " ");
    }


}



