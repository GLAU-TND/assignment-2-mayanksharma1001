/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = 8;
        while (i > 0) {
            tree.add(scanner.nextInt());
            i--;
        }
        tree.preOrder(tree.node);
        System.out.println();
        tree.postOrder(tree.node);
    }
}