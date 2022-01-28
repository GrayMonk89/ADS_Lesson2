package ru.gb.ADS_Lesson2;

public class SelectionSort {
    public static void sort(Notebook[] notebooksArray) {
        for (int i = 0; i < notebooksArray.length - 1; i++) {
            int min = i;
            for (int j = min + 1; j < notebooksArray.length; j++) {
                if(notebooksArray[j].getPrice() < notebooksArray[min].getPrice()){
                    min = j;
                }else if(notebooksArray[j].getPrice() == notebooksArray[min].getPrice()){
                    int minTemp = j;
                    if(notebooksArray[j].getMemory() < notebooksArray[min].getMemory()){
                        Notebook temp = notebooksArray[min];
                        notebooksArray[min] = notebooksArray[minTemp];
                        notebooksArray[minTemp] = temp;
                    }
                } else if(notebooksArray[j].getMemory() == notebooksArray[min].getMemory()){
                    int minTemp = j;
                    if(notebooksArray[j].getBrand().ordinal() == notebooksArray[min].getBrand().ordinal()){
                        Notebook temp = notebooksArray[min];
                        notebooksArray[min] = notebooksArray[minTemp];
                        notebooksArray[minTemp] = temp;
                    }
                }
            }
            Notebook temp = notebooksArray[i];
            notebooksArray[i] = notebooksArray[min];
            notebooksArray[min] = temp;
        }
    }
}
