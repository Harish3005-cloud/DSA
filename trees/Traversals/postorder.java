package trees.Traversals;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class postorder {
    Node root;

    void postordert(Node node) {
        if (node == null) {
            return;
        }

        postordert(node.left);
        postordert(node.right);
        System.out.println(node.key + " ");
    }

    public static void main(String[] args) {
        postorder tree = new postorder();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(11);
        tree.root.left.left = new Node(13);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(20);
        tree.root.right.right = new Node(5);
        System.out.println("\n---postorder Traversal---\n");
        tree.postordert(tree.root);
    }
}
