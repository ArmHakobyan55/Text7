package service;

import model.Student;

public class StudentService {

    public static Student[] convert(String[] lines) {

        Student[] students = new Student[lines.length];

        for (int i = 0; i < lines.length; i++) {
            students[i] = new Student(lines[i]);
        }

        return students;
    }

    public static Student max(Student[] students) {

        Student max = students[0];

        for (int i = 0; i < students.length; i++) {

            if (students[i].getYear() < max.getYear()) {
                max = students[i];
            }
        }

        return max;
    }
    public static void sort(Student[] students) {

        for (int i = 0; i < students.length; i++) {

            for (int j = i + 1; j < students.length; j++) {

                if (students[i].getYear() > students[j].getYear()) {

                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}