package org.example;
public class test {
    public static void main(String[] args) {
        iuStudent iustudent = new iuStudent("Butorov Sergey Lvovich",7,-1);
        mathStudent mathstudent = new mathStudent("Danilov Artem Lukashenkovich",5,3);
        iustudent.WriteExam();
        mathstudent.WriteExam();
    }
}

