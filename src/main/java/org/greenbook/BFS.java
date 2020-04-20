package org.greenbook;

import org.greenbook.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BFS {

    public static String traverse(TreeNode root) {
        List<TreeNode> queue = new ArrayList<>();
        List<TreeNode> visited = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        queue.add(root);

        visit(queue, visited, elements);

        String output = "";
        for (Integer element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static void visit(List<TreeNode> queue, List<TreeNode> visited, List<Integer> elements) {
        if (queue.isEmpty()) {
            return;
        }
        TreeNode root = queue.get(0);
        if (root == null) {
            return;
        }
        if (!visited.contains(root)) {
            elements.add(root.value);
            visited.add(root);
            for (TreeNode child: root.children) {
                if (!visited.contains(child)) {
                    queue.add(child);
                }
            }
        }
        queue.remove(root);
        visit(queue, visited, elements);
    }

}
