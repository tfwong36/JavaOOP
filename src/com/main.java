package com;
import student.Student;
public class main {
    public static void main(String[] args) {
        Student chriswong = new Student(1,"chriswong","male",18);
        System.out.println(chriswong.getName());
        System.out.println(chriswong.getAge());
        System.out.println(chriswong.getGender());
        System.out.println(chriswong.getId());
    }
}
