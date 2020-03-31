/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        //The Queue enqueues them according to ascending Roll Number as given for example in Problem Statement
        myPriorityQueue.enqueue(new Node(new Student(10, "bob")));
        myPriorityQueue.enqueue(new Node(new Student(47, "ram")));
        myPriorityQueue.enqueue(new Node(new Student(54, "boby")));
        myPriorityQueue.enqueue(new Node(new Student(66, "laxman")));
        myPriorityQueue.enqueue(new Node(new Student(87, "lalit")));
        myPriorityQueue.printQueue();
    }
}