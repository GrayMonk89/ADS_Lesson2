package ru.gb.ADS_Lesson2;



public class Notebook {
    Brand brand;
    int price;
    int memory;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    @Override
    public String toString() {
        return "NoteBook: " + price + "$, " + memory + "Gb RAM, brand = " + brand;
    }
}
