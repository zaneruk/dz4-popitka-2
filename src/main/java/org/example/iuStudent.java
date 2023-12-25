package org.example;

public class iuStudent extends studenttest {
    public iuStudent(String fio,int course,int grade) {
        super(fio,course,grade);
    }
    @Override
    public void WriteExam() {
        System.out.println("IU student "+getFio()+" from "+getCourse()+"th course is writing an exam");
    }
}
