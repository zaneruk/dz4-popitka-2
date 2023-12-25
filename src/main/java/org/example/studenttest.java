package org.example;

public abstract class studenttest {
    private final String fio;
    private int course;
    private int grade;
    //конструктор для параметров
    public studenttest(String fio, int course,int grade) {
        this.fio = fio;
        if (course < 1 || course > 6) {
            throw new RuntimeException("course is invalid.");
        } else {
            this.course = course;
        }
        if (grade < 0 || grade > 5) {
            throw new RuntimeException("grade is invalid.");
        } else {
            this.grade = grade;
        }
    }
    public int getCourse(){
        return course;
    }
    public String getFio(){
        return fio;
    }
    public  int getGrade(){
        return grade;
    }
    public abstract void WriteExam(); //метод без реалезации
}
