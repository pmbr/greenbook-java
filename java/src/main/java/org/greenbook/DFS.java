package org.greenbook;

import org.greenbook.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static <T> String traverse(TreeNode<T> root) {
        List<TreeNode<T>> visited = new ArrayList<>();
        List<T> elements = new ArrayList<>();

        visit(root, visited, elements);

        String output = "";
        for (T element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static <T> void visit(TreeNode<T> node, List<TreeNode<T>> visited, List<T> elements) {
        visited.add(node);
        if (!elements.contains(node.getValue())) {
            elements.add(node.getValue());
        }
        if (node.getChildren() != null && !node.getChildren().isEmpty()) {
            for (TreeNode child: node.getChildren()) {
                if (!visited.contains(child)) {
                    visit(child, visited, elements);
                }
            }
        }
    }

}
