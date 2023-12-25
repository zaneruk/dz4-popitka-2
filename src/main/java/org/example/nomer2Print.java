package org.example;

public class nomer2Print {
    public static void main(String[] args) {
    nomer2 mas = new nomer2();
    mas.add("cat");
    mas.add("doog");
    mas.add("hi");
    mas.add("asadama");
    System.out.println(mas.printMas());
    System.out.println("Max length el is "+mas.getMax());
    System.out.println("Avg length of all el-s is "+mas.getAverageLength());
    }
}
