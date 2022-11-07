package edu.sdccd.cisc191;

public class BinarySearchTree {

    /**
     * Recursively finds the needle in the Binary Search Tree (BST) haystack
     * @param root which node to start searching from
     * @param needle the data to search for
     * @return the first BSTNode containing the needle, null if doesn't exist
     */
    public BSTNode contains(BSTNode root, String needle) {
        // TODO: fill this out, you can choose any order of traversal

        // return null if root is null
        if(root == null){
            return null;
        }

        // item in array equals root data, return root
        if(needle == root.getData()){
            return root;
        }

        // value of needle is less than root data, traverse data from left side of tree
        else if (needle.compareTo(root.getData()) < 0){
            return contains(root.getLeft(), needle);
        }

        // traverse data from right side of tree
        else {
            return contains(root.getRight(), needle);
        }

    }

    /**
     * Recursively converts a String array to Binary Search Tree (BST)
     * @param array the array of Strings to import into the BST
     * @param start index in the array to begin importing
     * @param end index in the array to stop importing
     * @return the root node of the generated BST
     */
    public BSTNode fromArray(String[] array, int start, int end) {
        // TODO: fill this out, you can choose any order of traversal

        // return null if start > end
        if (start > end) {
            return null;
        }

        //
        else {

            // create integer container middle node
            int mid = (start + end) / 2;

            // initializes new node from middle of array list
            BSTNode node = new BSTNode(array[mid]);

            // sets values of left subtree by calling setLeft() method from BSTNode class
            node.setLeft((fromArray(array , start , mid -1 )));

            // sets values of right subtree by calling setRight() method from BSTNode class
            node.setRight((fromArray(array, mid + 1 , end )));

            // returns node value from BST
            return node;
        }

    }

}
