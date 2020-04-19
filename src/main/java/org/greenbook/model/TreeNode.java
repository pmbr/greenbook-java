package org.greenbook.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode {

    public TreeNode(Integer value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public Integer value;
    public List<TreeNode> children;

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return value == treeNode.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
