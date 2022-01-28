package ru.gb.ADS_Lesson2;

public class SpeedTest {
    private static long time;

    public static void startTest(){
        time = System.currentTimeMillis();
    }

    public static void endTest(){
        time = System.currentTimeMillis() - time;
        System.out.println(time + "ms");
    }
}
