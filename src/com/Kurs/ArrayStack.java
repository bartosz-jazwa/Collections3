package com.Kurs;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private static final int DEFAULT_EMPTY_VALUE = Integer.MAX_VALUE;
    private T[] stackArrayHolder= (T[]) new Object[15];
    private int currentIndex = -1;

    @Override
    public void push(T element) {

        currentIndex++;
        if(currentIndex>=stackArrayHolder.length){
            int newSize = stackArrayHolder.length*2;
            stackArrayHolder = Arrays.copyOf(stackArrayHolder,newSize);
        }
        stackArrayHolder[currentIndex]=element;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        T currentValue = stackArrayHolder[currentIndex];
        currentIndex--;
        return currentValue;
    }

    @Override
    public T poll() {
        T currentValue = stackArrayHolder[currentIndex];
        return currentValue;
    }

    @Override
    public boolean isEmpty() {

        return currentIndex<0;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(stackArrayHolder));
        return "ArrayStack{" +
                "stackArrayHolder=" + Arrays.toString(stackArrayHolder) +
                ", currentIndex=" + currentIndex +
                '}';
    }

    public int getSize() {
        int size = currentIndex+1;
        return size;
    }
}
