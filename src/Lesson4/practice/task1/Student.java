package Lesson4.practice.task1;

import java.util.List;

public class Student {
    private String surname;
    private String abb;
    private Integer groupNumber;
    private List<Integer> marks;

    public Student(String surname, String abb, Integer groupNumber, List<Integer> marks) {
        this.surname = surname;
        this.abb = abb;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public double averageMark() {
        Integer sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return (double) (sum / marks.size());
    }

}
