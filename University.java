package com.company;

import java.util.ArrayList;

public class University {
    ArrayList<Student> listStudent=new ArrayList<>();
    public University() {
        listStudent.add(new Student("Aleksandr","ASU"));
        listStudent.add(new Student("Irina","EVM"));
        listStudent.add(new Student("Nikolai","IST"));
        listStudent.add(new Student("Olga","ISM"));
        listStudent.add(new Student("Victor","ASU"));
    }
    public void AddStudent(Student student){
        listStudent.add(student);
    }
    public void DelStudent(Student student){
        listStudent.remove(student);
    }
    public Student OutputStudent(int i){
        return listStudent.get(i);
    }
}
