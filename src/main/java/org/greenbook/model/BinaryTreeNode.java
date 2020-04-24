package org.greenbook.model;

import java.util.Objects;

public class BinaryTreeNode<T> {

    private T value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return value.equals(treeNode.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
