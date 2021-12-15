package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс LinkedList
 */
public class ListLL {
    /**
     * создание Linked List'а
     */
    LinkedList list = new LinkedList<>();

    /**
     * добавление
     * @param count количество повторений
     */
    public void Add(int count)
    {
        for(int i=0;i<count;i++)
            list.add(i);
    }

    /**
     *получение значения
     * @param count количество повторений
     */
    public void Get(int count)
    {
        for(int i=0;i<count;i++)
            list.get(i);
    }

    /**
     * удаление
     * @param count количество повторений
     */
    public void Delete(int count)
    {
        for(int i=count-1;i>=0;i--)
            list.remove(i);
    }

}