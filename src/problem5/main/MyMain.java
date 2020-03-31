/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        //Let us create a list of students
        ArrayList<Student> studentList = new ArrayList<Student>();
        //hard coding some student value
        studentList.add(new Student(1, "ABC", 1, 0));
        studentList.add(new Student(2, "DEF", 2, 2));
        studentList.add(new Student(3, "GHI", 1, 1));
        studentList.add(new Student(4, "JKL", 2, 2));
        studentList.add(new Student(5, "MNO", 0, 0));
        studentList.add(new Student(6, "PQR", 0, 1));
        studentList.add(new Student(7, "STU", 1, 1));
        studentList.add(new Student(8, "VWX", 2, 1));
        studentList.add(new Student(9, "YZA", 0, 0));
        studentList.add(new Student(10, "AAB", 0, 0));
        studentList.add(new Student(11, "AAC", 2, 1));
        //creating a queue
        MyCircularQueue studentqueue = new MyCircularQueue();
        studentqueue.enqueue(studentList);
        //printing queue
        // A,F,H,K should be present in the queue
        studentqueue.printQueue();


    }
}