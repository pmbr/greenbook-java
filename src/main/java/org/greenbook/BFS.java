package org.greenbook;

import org.greenbook.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BFS {

    public static String traverse(TreeNode<Integer> root) {
        List<TreeNode<Integer>> queue = new ArrayList<>();
        List<TreeNode<Integer>> visited = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        queue.add(root);

        visit(queue, visited, elements);

        String output = "";
        for (Integer element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static void visit(List<TreeNode<Integer>> queue, List<TreeNode<Integer>> visited, List<Integer> elements) {
        if (queue.isEmpty()) {
            return;
        }
        TreeNode<Integer> root = queue.get(0);
        if (root == null) {
            return;
        }
        if (!visited.contains(root)) {
            elements.add(root.getValue());
            visited.add(root);
            for (TreeNode child: root.getChildren()) {
                if (!visited.contains(child)) {
                    queue.add(child);
                }
            }
        }
        queue.remove(root);
        visit(queue, visited, elements);
    }

}
