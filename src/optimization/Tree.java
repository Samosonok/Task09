package optimization;

public class Tree {

    Node root = new Node(25);

    public void add(int value) {
        addRecursive(root, value);
    }

    private Node addRecursive(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }
        if (value <= node.value) {
            node.left = addRecursive(node.left, value);
        } else {
            node.right = addRecursive(node.right, value);
        }
        return node;
    }

    public void print() {
        printRecursive(root);
    }

    private void printRecursive(Node node) {
        if (node.left != null) {
            printRecursive(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            printRecursive(node.right);
        }
    }
}