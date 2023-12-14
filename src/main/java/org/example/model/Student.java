package org.example.model;

public class Student {
    // заниматься на интересных для него парах
    // отвечать некоторые вопросы
    // решать задачу перед дедлайном

    private final String name;
    private final String surname;
    protected int gapBeforeDeadline = 3;
    private String[] interestingClasses;
    private static final String questionAboutHomework = "Сделано ли дз?";

    public Student(String name, String surname, String[] interestingClasses) {
        this.name = name;
        this.surname = surname;
        this.interestingClasses = interestingClasses;
    }

    // отвечать на некоторые вопросы
    public void answerToQuestion(String question) {
        if (question.equals(questionAboutHomework)) {
            System.out.println("Конечно.");
            return;
        }
        if (Math.random() > 1 - 1 / (question.chars().filter(ch -> ch == ' ').count() + 1)) {
            System.out.println("Могу ответить на " + question);
        } else {
            System.out.println("Не могу ответить на вопрос.");
        }
    }

    // решать задачу перед дедлайном
    public void solveTaskBeforeDeadline(String task, int daysBeforeDeadline) {
        if (daysBeforeDeadline < gapBeforeDeadline) {
            if (daysBeforeDeadline > 2) {
                System.out.println("Пора работать.");
            } else {
                System.out.println("Я занят, я решаю задачу.");
            }
        } else {
            System.out.println("Отдохну, ещё есть время.");
        }
    }

    // заниматься на интересных для него парах
    public void studyClass(String currentClass) {
        if (containsClass(currentClass)) {
            System.out.println("Мне это интересно, я занимаюсь.");
        } else {
            if (Math.random() < 0.3) {
                System.out.println("Пойду прогуляюсь.");
            } else {
                System.out.println("????");
            }
        }
    }

    private boolean containsClass(String currentClass) {
        for (int i = 0; i < interestingClasses.length; i++) {
            if (interestingClasses[i].equals(currentClass)) {
                return true;
            }
        }
        return false;
    }
}
