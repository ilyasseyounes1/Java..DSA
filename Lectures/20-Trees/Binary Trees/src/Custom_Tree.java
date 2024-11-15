import java.util.Scanner;

public class Custom_Tree{
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node (int val) {
            this.val = val;
        }
    }
    private Node root;
    // insert element :
    public void populate ( Scanner scanner) {
        System.out.println ("Enter the value of the root : ");
        int value = scanner.nextInt();
        root = new Node (value);
        populate ( scanner , root );
    }
    private void populate (Scanner scanner, Node node) {
        System.out.println ("Do you want to enter left of " + node.val);
        boolean left = scanner.nextBoolean ();
        if (left) {
            System.out.println ("Enter the value of the left of " + node.val);
            int value = scanner.nextInt ();
            node.left = new Node (value);
            populate ( scanner , node.left );
        }
        System.out.println ("Do you want to enter right of " + node.val);
        int value = scanner.nextInt ();
        node.right = new Node (value);
        populate ( scanner , node.right );
    }




}
