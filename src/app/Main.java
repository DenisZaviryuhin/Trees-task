package app;


public class Main {


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree().getTree();
        Outputer outputer = new Outputer();
        outputer.getOutput(tree);

    }


}


