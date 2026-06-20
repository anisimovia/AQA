package Lesson4.practice.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);

        students.add(new Student("Fred", "FT", 1, Arrays.asList(1,2,3,4,5)));
        students.add(new Student("Tom", "AT", 2, Arrays.asList(4,5,4,4,5)));
        students.add(new Student("Kate", "KT", 3, Arrays.asList(2,1,1,1,2)));

        students.sort((s1, s2) -> Double.compare(s1.averageMark(), s2.averageMark()));

        for (Student student: students){
            System.out.println("Студент: " + student.getSurname() + ", Средняя оценка: "  + student.averageMark() + ", Номер группы: " + student.getGroupNumber());
        }
    }
}
