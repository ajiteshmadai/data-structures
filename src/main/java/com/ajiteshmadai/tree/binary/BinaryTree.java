package com.ajiteshmadai.tree.binary;

import java.util.List;

public interface BinaryTree {


    void insert(Integer node);

    List<Integer> preOrderTraversal();

    List<Integer> postOrderTraversal();

    List<Integer> inOrderTraversal();


}
