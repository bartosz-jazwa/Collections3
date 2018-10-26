package com.Kurs;

public interface Stack<T> {

    void push(T element);

    T pop();

    T poll();

    boolean isEmpty();

}
