package edu.merzlab.main;

import java.util.HashMap;
import java.util.Map;

import edu.merzlab.model.Exam;
import edu.merzlab.model.Student;

public class D06_Maps {

    public static void main(String[] args) {
        
        Map<Student, Exam> studentsWithExam = new HashMap<>();

        /* Werte setzen */

        studentsWithExam.put(new Student(1, "Hans"), new Exam("Mathe", 3.5));
        studentsWithExam.put(new Student(2, "Lisa"), new Exam("Mathe", 1.7));
        studentsWithExam.put(new Student(3, "Max"), new Exam("Mathe", 2.5));
    }

}
