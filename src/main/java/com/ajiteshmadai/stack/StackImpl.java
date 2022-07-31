package com.ajiteshmadai.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack {
    private List<String> elements;


    @Override
    public void push(String element) {
        if (this.elements == null) {
            this.elements = new ArrayList<>();
        }

        elements.add(element);
    }
    @Override
    public String pop() {
        if(this.elements != null) {
            int size = this.elements.size();
            return this.elements.remove(size - 1);
        } else {
            throw new IllegalStateException("Popping without any element added to stack");
        }

    }

    @Override
    public int size() {
        if (this.elements != null) {
            return elements.size();
        }
        return 0;
    }

    @Override
    public void print() {
        System.out.println(this.elements);
    }


}
