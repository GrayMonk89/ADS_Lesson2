package ru.gb.ADS_Lesson2;

public class ADS_Lesson2 {
    public static void main(String[] args) {
        int arrLength = 10000;

        Notebook[] notebooksArray = NotebookActions.getArray(arrLength);
        SpeedTest.startTest();
        DoubleSelectionSort.sort(notebooksArray);
        SpeedTest.endTest();

        notebooksArray = NotebookActions.getArray(arrLength);
        SpeedTest.startTest();
        DoubleSelectionSort.sort(notebooksArray);
        SpeedTest.endTest();
    }
}
