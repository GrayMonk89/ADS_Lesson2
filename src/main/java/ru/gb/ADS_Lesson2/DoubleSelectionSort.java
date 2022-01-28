package ru.gb.ADS_Lesson2;

public class DoubleSelectionSort {
    public static void sort(Notebook notebooksArray[]) {

        int minIndex = 0, maxIndex = 0;
        for (int j = 0; j < notebooksArray.length / 2; j++) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            Notebook tmp;
            for (int i = j; i < notebooksArray.length - j; i++) {
                if (min > notebooksArray[i].getPrice()) {
                    min = notebooksArray[i].getPrice();
                    minIndex = i;
                }
                if (notebooksArray[i].getPrice() > max) {
                    max = notebooksArray[i].getPrice();
                    maxIndex = i;
                }
            }
            tmp = notebooksArray[j];
            if (j == maxIndex) {
                maxIndex = minIndex;
            }
            notebooksArray[j] = notebooksArray[minIndex];
            notebooksArray[minIndex] = tmp;

            tmp = notebooksArray[notebooksArray.length - j - 1];
            notebooksArray[notebooksArray.length - j - 1] = notebooksArray[maxIndex];
            notebooksArray[maxIndex] = tmp;
        }
    }
}
