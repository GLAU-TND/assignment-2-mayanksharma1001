/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem3.node.Node;

public class MyQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        rear = null;
        front = null;
        size++;
    }

    public void enQueue(TreeNode root) {
        MyBinarySearchTree.preOrder(root);
        String[] data = MyBinarySearchTree.StringBuilder.toString().split(" ");
        for (int i = 0; i < data.length; i++) {
            Node node = new Node(Integer.parseInt(data[i]));
            if (front == null) {
                rear = node;
                front = node;
                size++;
            } else {
                rear.setNext(node);
                rear = node;
                size++;
            }

        }
    }

    public void printQueue() {
        Node temp = this.front.getNext();
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 2) {
                System.out.println(temp.getData() + "---->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData());
            }
        }
    }
}
