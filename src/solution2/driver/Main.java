package solution2.driver;

import solution2.model.Node;


public class Main {
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;

    static void toSkewed(Node root) {

        if (root == null) {
            return;
        }
        toSkewed(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		toSkewed(rightNode);

        
    }

    static void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }

    public static void main(String[] args) {

        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(40);

        int order = 0;
        toSkewed(node);
        System.out.println("The resultant  output is :");
        traverseRightSkewed(headNode);
    }
}