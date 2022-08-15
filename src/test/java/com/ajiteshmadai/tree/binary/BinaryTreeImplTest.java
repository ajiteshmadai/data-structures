package com.ajiteshmadai.tree.binary;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;

public class BinaryTreeImplTest {

    BinaryTree tree = new BinaryTreeImpl();
    @Test
    public void testInsertNode() {
        Integer[] arr =  {2, 7, 6, 4, 10, 11, 15};

        for (int i = 0; i < arr.length; i++) {
            //Node n1 = new Node();
            tree.insert(arr[i]);
        }

        System.out.println(tree);


    }


    @Test
    public void testPreOrderTraversal() {
        Integer[] arr =  {2, 7, 6, 4, 10, 11, 15};

        for (int i = 0; i < arr.length; i++) {
            //Node n1 = new Node();
            tree.insert(arr[i]);
        }
        System.out.println(tree.preOrderTraversal());
    }

    @Test
    public void testPostOrderTraversal() {
        Integer[] arr =  {2, 7, 6, 4, 10, 11, 15};

        for (int i = 0; i < arr.length; i++) {
            //Node n1 = new Node();
            tree.insert(arr[i]);
        }
        System.out.println(tree.postOrderTraversal());
    }

    @Test
    public void testInOrderTraversal() {
        Integer[] arr =  {2, 7, 6, 4, 10, 11, 15};

        for (int i = 0; i < arr.length; i++) {
            //Node n1 = new Node();
            tree.insert(arr[i]);
        }
        System.out.println(tree.inOrderTraversal());
    }
}
