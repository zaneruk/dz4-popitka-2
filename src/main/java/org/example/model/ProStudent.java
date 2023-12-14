package org.example.model;

public class ProStudent extends Student implements CanWriteReports {
    private final String patronymic;

    // this, super
    public ProStudent(String name, String surname, String[] interestingClasses, String patronymic) {
        super(name, surname, interestingClasses);
        this.patronymic = patronymic;
        super.gapBeforeDeadline = 2;
    }

    @Override
    public void solveTaskBeforeDeadline(String task, int daysBeforeDeadline) {
        if (daysBeforeDeadline < gapBeforeDeadline) {
            if (daysBeforeDeadline > 1) {
                System.out.println("Пора работать.");
            } else {
                System.out.println("Скоро я приступлю к задаче.");
            }
        } else {
            System.out.println("Сейчас решаю другие задачи, к дедлайну всё успею, не волнуйся.");
        }
    }


    @Override
    public void writeReport() {
        System.out.println("Пишу отчёт");
    }
}
