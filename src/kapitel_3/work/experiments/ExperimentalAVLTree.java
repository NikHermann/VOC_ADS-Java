package kapitel_3.work.experiments;

import kapitel_3.work.generics.AVLTree;
import kapitel_3.work.generics.IComparator;

public class ExperimentalAVLTree<T> extends AVLTree<T> {
    Node<T> newAVLNode = null;
    
    public ExperimentalAVLTree(IComparator<T> comparator) {
        super(comparator);
    }

    public void insert(T data) {                 // The overwritten insert-
        newAVLNode = new Node<T>(null, data, null); // method reports the growth
        root = insert(root, newAVLNode);              // of the tree up to the
    }
    
    public void grown() {
        grownTo(newAVLNode);
    }
}
