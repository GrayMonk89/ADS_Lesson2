package ru.gb.ADS_Lesson2;

import java.util.Random;

public class NotebookActions {
    private static final int MIN_PRICE = 500;
    private static final int MAX_PRICE = 2000;
    private static final int MIN_MEMORY = 4;
    private static final int MAX_MEMORY = 24;


    public static Notebook[] getArray(int arrLength) {
        Notebook[] notebooksArray = new Notebook[arrLength];
        for (int i = 0; i < notebooksArray.length; i++) {
            notebooksArray[i] = new Notebook();
            notebooksArray[i].setPrice((int) (((Math.random() * ((MAX_PRICE - MIN_PRICE) + 1)) + MIN_PRICE) / 50) * 50);
            notebooksArray[i].setMemory((int) (((Math.random() * ((MAX_MEMORY - MIN_MEMORY) + 1)) + MIN_MEMORY) / 4) * 4);
            notebooksArray[i].setBrand(Brand.values()[new Random().nextInt(4)]);
            //System.out.println(notebooksArray[i].getBrand() + " " + notebooksArray[i].getMemory() + " " + notebooksArray[i].getPrice());
        }
        return notebooksArray;
    }
}
