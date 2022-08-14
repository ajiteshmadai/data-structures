package com.ajiteshmadai.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    private List<T> elements;


    @Override
    public void init() {
        if(size() > 0){
            elements = new ArrayList<>();
        }
    }

    @Override
    public void push(T element) {
        if (elements == null) {
            elements = new ArrayList<>();
        }

        elements.add(element);
    }
    @Override
    public T pop() {
        if(elements != null) {
            int size = elements.size();
            return elements.remove(size - 1);
        } else {
            throw new StackOverflowError("Popping without any element added to stack");
        }

    }

    @Override
    public T peek() {
        if(size() > 0) {
            return elements.get(size() - 1);
        }
        throw new StackOverflowError();

    }

    @Override
    public int size() {
        if (elements != null) {
            return elements.size();
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return elements == null
                || elements.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(elements);
    }


}
