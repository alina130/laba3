package com.company;
import java.util.Scanner;

/**
 * Класс мейн
 */
public class Main {
    /**
     *Метод высчитывания времени
     * @param args агрумент командной строки
     */
    public static void main(String[] args) {
        int count=0;
        var in = new Scanner(System.in);
        System.out.println("Сколько раз выполнять методы : ");
        count = in.nextInt();

        ListAL Arrlist= new ListAL();
        ListLL Linklist= new ListLL();

        long after, before;

        System.out.println("Полученное время в миллисекундах  : ");
        System.out.println("               ADD   GET   DELETE");
        System.out.print("ArrayList:     ");
        before = System.currentTimeMillis();
        Arrlist.Add(count);
        after = System.currentTimeMillis();
        System.out.print(after-before+"      ");

        before = System.currentTimeMillis();
        Arrlist.Get(count);
        after = System.currentTimeMillis();
        System.out.print(after-before+"      ");

        before = System.currentTimeMillis();
        Arrlist.Delete(count);
        after = System.currentTimeMillis();
        System.out.println(after-before+"         ");

        System.out.print("LinkedList:    ");
        before = System.currentTimeMillis();
        Linklist.Add(count);
        after = System.currentTimeMillis();
        System.out.print(after-before+"     ");

        before = System.currentTimeMillis();
        Linklist.Get(count);
        after = System.currentTimeMillis();
        System.out.print(after-before+"     ");

        before = System.currentTimeMillis();
        Linklist.Delete(count);
        after = System.currentTimeMillis();
        System.out.println(after-before+"      ");

    }
}