package app;

public class Outputer {
    public void getOutput(BinaryTree tree) {
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);


    }
}
