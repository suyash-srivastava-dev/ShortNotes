# Tree traversal:

## Depth First Traversals:

(a) Inorder (Left, Root, Right) : 4 2 5 1 3

> Algorithm Inorder(tree)

1.  Traverse the left subtree, i.e., call Inorder(left-subtree)
2.  Visit the root.
3.  Traverse the right subtree, i.e., call Inorder(right-subtree)


    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

> Similary for preorder and postorder, by changing the order of element access

(b) Preorder (Root, Left, Right) : 1 2 4 5 3

(c) Postorder (Left, Right, Root) : 4 5 2 3 1

## Breadth-First

or Level Order Traversal: 1 2 3 4 5
