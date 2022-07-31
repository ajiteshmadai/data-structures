package com.ajiteshmadai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackImplTest {

    @Test
    public void testPush() {
        Stack stack = new StackImpl();
        stack.push("1");
        stack.push("2");

        assertEquals(2, stack.size());
        stack.print();
    }

    @Test
    public void testPop() {
        Stack stack = new StackImpl();
        stack.push("1");
        stack.push("2");

        assertEquals("2",stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    public void testEmptyPop() {
        Stack stack = new StackImpl();
        assertEquals(0, stack.size());
        assertThrows(IllegalStateException.class, stack::pop);

    }



}
