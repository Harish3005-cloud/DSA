package trees.Traversals;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class inorder {
    Node root;

    void inordert(Node node) {
        if (node == null) {
            return;
        }

        inordert(node.left);
        System.out.println(node.key + " ");
        inordert(node.right);
    }

    public static void main(String[] args) {
        inorder tree = new inorder();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(11);
        tree.root.left.left = new Node(13);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(20);
        tree.root.right.right = new Node(5);
        System.out.println("\n---InOrder Traversal---\n");
        tree.inordert(tree.root);
    }
}
