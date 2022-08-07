package com.ajiteshmadai.stack;

import java.util.List;

public interface Stack {

    void init();

    void push(String element);

    String pop();

    String peek();

    int size();

    boolean isEmpty();

    void print();


}
