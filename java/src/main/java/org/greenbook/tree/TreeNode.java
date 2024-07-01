package org.greenbook.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode<T> {

    private T value;
    private List<TreeNode> children;

    public TreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public T getValue() {
        return this.value;
    }

    public List<TreeNode> getChildren() {
        return this.children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return value.equals(treeNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
