package org.greenbook;

import org.greenbook.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFS {

    public static String traverse(TreeNode<Integer> root) {
        List<TreeNode<Integer>> visited = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        visit(root, visited, elements);

        String output = "";
        for (Integer element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static void visit(TreeNode<Integer> node, List<TreeNode<Integer>> visited, List<Integer> elements) {
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
