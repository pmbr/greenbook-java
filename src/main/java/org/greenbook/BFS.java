package org.greenbook;

import org.greenbook.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BFS {

    public static <T> String traverse(TreeNode<T> root) {
        List<TreeNode<T>> queue = new ArrayList<>();
        List<TreeNode<T>> visited = new ArrayList<>();
        List<T> elements = new ArrayList<>();

        queue.add(root);

        visit(queue, visited, elements);

        String output = "";
        for (T element: elements) {
            output += element.toString() + " ";
        }

        return output.trim();
    }

    private static <T> void visit(List<TreeNode<T>> queue, List<TreeNode<T>> visited, List<T> elements) {
        if (queue.isEmpty()) {
            return;
        }
        TreeNode<T> root = queue.get(0);
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
