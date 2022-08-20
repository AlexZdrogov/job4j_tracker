package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
       Student student = new Student();
       student.setName("Alexandr Zdrogov");
       student.setGroup(1111);
       student.setEntry(new Date());
        System.out.println(student.getName() + " группа: " + student.getGroup());

    }
}
