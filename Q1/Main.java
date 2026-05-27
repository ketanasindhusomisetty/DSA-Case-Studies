class Node {
    int score, height;
    String story;
    Node left, right;

    Node(int score, String story) {
        this.score = score;
        this.story = story;
        this.height = 1;
    }
}

class AVLTree {

    int height(Node n) {
        return (n == null) ? 0 : n.height;
    }

    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Node insert(Node node, int score, String story) {

        if (node == null)
            return new Node(score, story);

        if (score < node.score)
            node.left = insert(node.left, score, story);
        else if (score > node.score)
            node.right = insert(node.right, score, story);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.story + " : " + root.score);
            inorder(root.right);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
        Node root = null;

        root = tree.insert(root, 50, "AI News");
        root = tree.insert(root, 30, "Tech Update");
        root = tree.insert(root, 70, "Startup Story");
        root = tree.insert(root, 90, "Open Source");
        root = tree.insert(root, 60, "Programming Tips");

        System.out.println("Hacker News Story Rankings:");
        tree.inorder(root);

        System.out.println("\nScore Update:");
        System.out.println("Deleting old score and reinserting updated score.");

        root = tree.insert(root, 95, "Open Source");

        System.out.println("\nUpdated Rankings:");
        tree.inorder(root);
    }
}