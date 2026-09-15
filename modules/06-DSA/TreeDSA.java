public class TreeDSA {

    // ==================== 1. NODE ====================

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // ==================== 2. CREATE TREE ====================

    static Node createTree() {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        return root;
    }


    // ==================== 3. PREORDER ====================

    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }


    // ==================== 4. INORDER ====================

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }


    // ==================== 5. POSTORDER ====================

    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);

        System.out.print(root.data + " ");
    }


    // ==================== 6. SEARCH IN BST ====================

    static boolean search(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }


    // ==================== 7. INSERT IN BST ====================

    static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else {
            root.right = insert(root.right, value);
        }

        return root;
    }


    // ==================== 8. FIND MINIMUM ====================

    static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }


    // ==================== 9. FIND MAXIMUM ====================

    static Node findMax(Node root) {

        while (root.right != null) {
            root = root.right;
        }

        return root;
    }


    // ==================== 10. MAIN ====================

    public static void main(String[] args) {

        Node root = createTree();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();


        // ==================== BST ====================

        Node bst = null;

        bst = insert(bst, 50);
        bst = insert(bst, 30);
        bst = insert(bst, 70);
        bst = insert(bst, 20);
        bst = insert(bst, 40);
        bst = insert(bst, 60);
        bst = insert(bst, 80);

        System.out.print("BST Inorder: ");
        inorder(bst);
        System.out.println();

        System.out.println("Search 40: " + search(bst, 40));

        System.out.println(
            "Minimum: " + findMin(bst).data
        );

        System.out.println(
            "Maximum: " + findMax(bst).data
        );
    }


    // ==================== IMPORTANT CONCEPTS ====================

    /*
        Tree
        │
        ├── Root
        ├── Node
        ├── Parent
        ├── Child
        ├── Leaf
        ├── Subtree
        │
        ├── Traversals
        │   ├── Preorder
        │   ├── Inorder
        │   └── Postorder
        │
        └── BST
            ├── Search
            ├── Insert
            ├── Minimum
            └── Maximum
    */

    // ==================== IMPORTANT PATTERNS ====================
    /*

        Tree
        │
        ├── 1. Basic Traversals
        │   ├── Preorder
        │   ├── Inorder
        │   ├── Postorder
        │   └── Level Order (BFS)
        │
        ├── 2. Basic Properties
        │   ├── Height / Maximum Depth
        │   ├── Number of Nodes
        │   ├── Number of Leaf Nodes
        │   └── Sum of Nodes
        │
        ├── 3. Tree Comparison
        │   ├── Same Tree
        │   └── Symmetric Tree
        │
        ├── 4. Path Problems
        │   ├── Root → Leaf Path
        │   ├── Path Sum
        │   └── Maximum Path Sum
        │
        ├── 5. BST
        │   ├── Search
        │   ├── Insert
        │   ├── Delete
        │   ├── Minimum / Maximum
        │   └── Validate BST
        │
        ├── 6. Lowest Common Ancestor
        │   ├── Binary Tree
        │   └── BST
        │
        ├── 7. Tree Views
        │   ├── Left View
        │   ├── Right View
        │   ├── Top View
        │   └── Bottom View
        │
        ├── 8. Tree Construction
        │   ├── Preorder + Inorder
        │   └── Postorder + Inorder
        │
        ├── 9. Tree Transformation
        │   ├── Invert / Mirror Tree
        │   └── Flatten Tree
        │
        └── 10. Advanced
            ├── Diameter
            ├── Balanced Binary Tree
            ├── Serialize / Deserialize
            └── Trie

     */
}