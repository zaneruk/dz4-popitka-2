package org.example;

import java.util.Arrays;

public class nomer2 {
    public String[] mas;
    public int size;

    public nomer2() {
        mas = new String[10];
        size = 0;
    }
    private void expendMas() {
        if (size == mas.length) {
            mas = Arrays.copyOf(mas, size * 2);
        }
    }
    public void add(String el) {
        expendMas();
        int index = size;
        for (int i = 0; i < size; i++) {
            if (el.length() < mas[i].length()) {
                index = i;
                break;
            }
        }
        for (int i = size; i > index; i--) {
            mas[i] = mas[i - 1];
        }
        mas[index] = el;
        size++;
    }

    public String getMax() {
        if (size == 0) {
            throw new IllegalStateException("mas is empty");
        }
        return mas[size - 1];
    }

    public double getAverageLength() {
        if (size == 0) {
            throw new IllegalStateException("mas is empty");
        }
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += mas[i].length();
        }
        return (double) totalLength / size;
    }
    public String printMas(){
        String vivod = "Elements of mas: \n";
        for(int i = 0; i < size; ++i){
            vivod += mas[i];
            if (i != size-1) vivod += "\n";
        }
        return vivod;
    }

}