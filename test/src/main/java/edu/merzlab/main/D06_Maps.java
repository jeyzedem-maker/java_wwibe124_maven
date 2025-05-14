package edu.merzlab.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import edu.merzlab.model.Exam;
import edu.merzlab.model.Student;

public class D06_Maps {

    public static void main(String[] args) {
        
        Map<Student, Exam> studentsWithExam = new HashMap<>();

        /* Werte setzen */

        studentsWithExam.put(new Student("1", "Hans"), new Exam("Mathe", 3.5));
        studentsWithExam.put(new Student("2", "Lisa"), new Exam("Mathe", 1.7));
        studentsWithExam.put(new Student("3", "Max"), new Exam("Mathe", 2.5));
        studentsWithExam.putIfAbsent(new Student("3", "Max"), new Exam("Mathe", 2.0));

        /* Werte ausgeben */

        System.out.println("Hans: " + studentsWithExam.get(new Student("1", "Hans")));
        System.out.println("Max: " + studentsWithExam.get(new Student("3", "Max")));

        /* Inhalte prüfen */
        System.out.println("Hans: " + studentsWithExam.containsKey(new Student("1", "Hans")));
        System.out.println("Peter: " + studentsWithExam.containsKey(new Student("4", "Peter")));
        System.out.println("Max: " + studentsWithExam.containsKey(new Student("3", "Max")));
        System.out.println("Mathe: " + studentsWithExam.containsValue(new Exam("Mathe", 1.0)));
        System.out.println("Mathe: " + studentsWithExam.containsValue(new Exam("Mathe", 1.7)));

        /* Werte  überschreiben*/
        System.out.println("Hans vorher: " + studentsWithExam.put(new Student("1", "Hans"), new Exam("Mathe", 3.3)));
        System.out.println("Hans nachher: " + studentsWithExam.get(new Student("1", "Hans")));
       // studentsWithExam.put(new Student("1", "Hans"), new Exam("Mathe", 3.0));
        System.out.println("Hans entgültig: " + studentsWithExam.get(new Student("1", "Hans")));


        System.out.println(studentsWithExam.keySet());
        System.out.println(studentsWithExam.values());
        System.out.println(studentsWithExam.entrySet());

        /* Datensammlung: Die Menge aller Schlüssel */
        System.out.println("Anwesenheitsliste:");
        for (Student student : studentsWithExam.keySet()) {
            System.out.printf("%-10s {}%n",student.getName());
        }

        /*Datensammlung: Sammlung aller Werte */
        double total = 0;
        int counter = 0;

        for (Exam exam : studentsWithExam.values()) {
            if (exam.getLecture().equals("Mathe")) {
                total += exam.getGrade();
                counter++;
            }
        }
        System.out.println("Durchschnitt: " + (total / counter));

        /* Datensammlung: Menge aller Schlüssel-Wert-Paare */

        for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
            Student student = entry.getKey();
            Exam exam = entry.getValue();
            System.out.println(student.getName() + ": " + exam.getGrade());
        }

        /* Datensummlung: Menge aller Schlüssel-Wert-Paare/einträge */
        System.out.println("Eegebnissse der Matheklausur:");
        for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
            Student student = entry.getKey();
            Exam oldExam = entry.getValue();
            Exam newExam = new Exam(oldExam.getLecture(), oldExam.getGrade() - 1);
            entry.setValue(newExam);
            System.out.println(student.getName() + ": " + newExam.getGrade() + " <- " + oldExam.getGrade());
        }

        // ForEach-Methode
        System.out.println("Ergebnisse der Matheklausur:");
        studentsWithExam.forEach((s, e) -> System.out.println( s.getId() + ": " + e.getGrade()));
    }

}
