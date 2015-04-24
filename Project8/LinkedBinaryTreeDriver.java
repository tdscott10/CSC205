package Project8;

import java.util.Iterator;

public class LinkedBinaryTreeDriver {

	public static void main(String[] args) {
			
		LinkedBinarySearchTree<Integer> Tree = new LinkedBinarySearchTree<Integer>();
		
		// Adding the elements to the BinaryTree. 
		Tree.addElement(10);
		Tree.addElement(8);
		Tree.addElement(15);
		Tree.addElement(25);
		Tree.addElement(1);

		//Getting the height and the size of the tree. 
		System.out.println("Tree: " + Tree.toString());
		System.out.println("Height of the tree: " + Tree.getHeight());
		System.out.println("Size of the tree: " + Tree.size());
		
		System.out.println();
		
		
		// traversing the tree with a Pre-Order Traversal
		System.out.print("Pre-order Traversal: ");
		
		Iterator<Integer> pre = Tree.iteratorPreOrder();		
		while (pre.hasNext()) {
			System.out.print (pre.next() + ",");
		}
		System.out.println();
		
		
		// traversing the tree with a In-Order Traversal
		System.out.print ("In-order traversal: ");
		Iterator<Integer> in = Tree.iteratorInOrder();
		while (in.hasNext()) {
			System.out.print (in.next() + ",");
		}
		System.out.println();


		// traversing the tree with a Post-Order Traversal
		System.out.print ("Post-order traversal: ");
		Iterator<Integer> post = Tree.iteratorPostOrder();
		while (post.hasNext()) {
			System.out.print (post.next() + ",");
		}
		System.out.println("\n");
		
		
		// Finding the min and max of the tree. 
		System.out.println("The max value is: " + Tree.findMax());
		System.out.println("The min value is: " + Tree.findMin());
		
		System.out.println();
		
		//Finding the left and right parts of the tree. 
		System.out.println("Left Part of the tree: " + Tree.getLeft());
		System.out.println("Right Part of the tree: " + Tree.getRight());
		
		System.out.println();
		
		// Removing the MAX value in the tree. 
		System.out.println("Removing the max value which is: " + Tree.removeMax());
		System.out.println("After removing the Max Value: " + Tree.toString());
		
		System.out.println();
		
		// Removing the MIN value in the tree. 
		System.out.println("Removing the min value which is: " + Tree.removeMin());
		System.out.println("After removing the Min and the max Value: " + Tree.toString());


		
		
		


		

		

	}

}
