package org.example;

public class mathStudent extends studenttest {
    public mathStudent(String fio,int course,int grade) {
        super(fio,course,grade);
    }
    @Override
    public void WriteExam() {
        System.out.println("FN student "+getFio()+" from "+getCourse()+"th course is writing an exam");
    }
}


