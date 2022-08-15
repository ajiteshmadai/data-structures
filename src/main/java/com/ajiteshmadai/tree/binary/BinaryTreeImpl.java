package com.ajiteshmadai.tree.binary;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class BinaryTreeImpl implements  BinaryTree {

    private Node root = null;

    @Override
    public void insert(Integer value) {
        if(value == null) {
            return;
        }
        Node node = new Node(value);
        if(this.getRoot() == null) {
            this.setRoot(node);
            return;
        }
        insertNode(node, root);
    }

    private void insertNode(Node node, Node parentNode) {

        if(node.compareTo(parentNode) <= 0) {
            if(parentNode.getLeftNode() == null) {
                parentNode.setLeftNode(node);
            } else {
                insertNode(node, parentNode.getLeftNode());
            }

        } else {
            if(parentNode.getRightNode() == null) {
                parentNode.setRightNode(node);
            } else {
                insertNode(node, parentNode.getRightNode());
            }
        }
    }

    @Override
    public List<Integer> preOrderTraversal() {
        List<Integer> sequence = new ArrayList<>();
        preOrderTraversal(this.getRoot(), sequence);
        return sequence;
    }

    private void preOrderTraversal(Node node, List<Integer> sequence) {

        if (node == null) {
            return;
        }
        sequence.add(node.getValue());
        if (node.getLeftNode() != null) {
            preOrderTraversal(node.getLeftNode(), sequence);
        }
        if (node.getRightNode() != null) {
            preOrderTraversal(node.getRightNode(), sequence);
        }
    }

    @Override
    public List postOrderTraversal() {
        List<Integer> sequence = new ArrayList<>();
        postOrderTraversal(this.getRoot(), sequence);
        return sequence;
    }

    private void postOrderTraversal(Node node, List<Integer> sequence) {
        if (node == null) {
            return;
        }

        if (node.getLeftNode() != null) {
            postOrderTraversal(node.getLeftNode(), sequence);
        }
        if (node.getRightNode() != null) {
            postOrderTraversal(node.getRightNode(), sequence);
        }
        sequence.add(node.getValue());

    }

    @Override
    public List inOrderTraversal() {
        List<Integer> sequence = new ArrayList<>();
        inOrderTraversal(this.getRoot(), sequence);
        return sequence;
    }
    private void inOrderTraversal(Node node, List<Integer> sequence) {
        if (node == null) {
            return;
        }

        if (node.getLeftNode() != null) {
            inOrderTraversal(node.getLeftNode(), sequence);
        }
        sequence.add(node.getValue());

        if (node.getRightNode() != null) {
            inOrderTraversal(node.getRightNode(), sequence);
        }


    }

    @Override
    public String toString() {
        return "BinaryTreeImpl{" +
                "root=" + root +
                '}';
    }
}
