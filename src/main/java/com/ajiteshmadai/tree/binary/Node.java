package com.ajiteshmadai.tree.binary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node implements Comparable{
    private Integer value;

    private Node leftNode;

    private Node rightNode;


    public Node(Integer value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }


    public Node(Integer value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int compareTo(Object node) {
        Node incomingNode = (Node) node;
        return this.value.compareTo(incomingNode.value);
    }

    @Override
    public String toString() {
        return "{ value: "+ value +
                ", left: " + leftNode +
                ", right: " + rightNode +
                '}';
    }


}
