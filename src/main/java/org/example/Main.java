package org.example;

import org.example.model.CanWriteReports;
import org.example.model.ProStudent;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Имя",
                "Фамилия",
                new String[]{"пара1", " пара2", "пара3"});
        firstStudent.answerToQuestion("Чему равно число PI?");
        firstStudent.answerToQuestion("Сделано?");
        firstStudent.studyClass("Социология");
        firstStudent.solveTaskBeforeDeadline("Найти пределы", 5);

        System.out.println("=========================");

        ProStudent proStudent = new ProStudent(
                "Имя",
                "Фамилия",
                new String[]{"пара1"},
                "Отчество"
        );

        proStudent.answerToQuestion("Чему равно число PI?");
        proStudent.answerToQuestion("Сделано?");
        proStudent.studyClass("пара1");
        proStudent.studyClass("пара5");
        proStudent.solveTaskBeforeDeadline("Написать отчёт", 3);
        proStudent.solveTaskBeforeDeadline("Написать ещё один отчёт", 1);
        proStudent.writeReport();
//        CanWriteReports canWriteReports = new ProStudent();
//        canWriteReports.writeReport();

    }
}