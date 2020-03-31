/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.println("How many elements do you want in the queue?");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            bst.add(scanner.nextInt());

        }
        MyQueue queue = new MyQueue();
        queue.enQueue(bst.node);
        queue.printQueue();
    }

}