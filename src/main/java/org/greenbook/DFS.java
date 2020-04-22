package org.greenbook;

import org.greenbook.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFS {

    public static String traverse(TreeNode root) {
        List<TreeNode> visited = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        visit(root, visited, elements);

        String output = "";
        for (Integer element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static void visit(TreeNode node, List<TreeNode> visited, List<Integer> elements) {
        visited.add(node);
        if (!elements.contains(node.value)) {
            elements.add(node.value);
        }
        if (node.children != null && !node.children.isEmpty()) {
            for (TreeNode child: node.children) {
                if (!visited.contains(child)) {
                    visit(child, visited, elements);
                }
            }
        }
    }

}
