package com.Kurs;

public interface Queue<T> {

    void push(T element);

    T poll();

    T peek();

    boolean isEmpty();
}
