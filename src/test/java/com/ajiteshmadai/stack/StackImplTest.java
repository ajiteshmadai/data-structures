package com.ajiteshmadai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackImplTest {

    @Test
    public void testInit() {
        Stack stack = new StackImpl();
        stack.push("123");
        stack.init();
        assertEquals(0, stack.size());
    }
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
        assertThrows(StackOverflowError.class, stack::pop);

    }

    @Test
    public void testIsEmpty() {
        Stack stack = new StackImpl();
        assertEquals(true, stack.isEmpty());
        stack.push("123");
        assertEquals(false, stack.isEmpty());
    }


    @Test
    public void testPeek() {
        Stack stack = new StackImpl();
        stack.push("123");
        assertEquals("123", stack.peek());

        stack.init();
        assertThrows(StackOverflowError.class, stack :: peek);
    }

    @Test
    public void testIntegerStack() {
        Stack<Integer> stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());


    }


}
