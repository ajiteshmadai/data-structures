package com.ajiteshmadai.stack;

import java.util.List;

public interface Stack<T> {

    void init();

    void push(T element);

    T pop();

    T peek();

    int size();

    boolean isEmpty();

    void print();


}
