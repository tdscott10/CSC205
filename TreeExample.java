import java.util.Iterator;

import Project8.*;



public class TreeExample {


	public static void main(String[] args) {
		//      A
		//    /   \
		//   B     E
		//  / \   /
		// C   D F
		
		LinkedBinaryTree<String> c = new LinkedBinaryTree<String>("C");
		LinkedBinaryTree<String> d = new LinkedBinaryTree<String>("D");
		LinkedBinaryTree<String> f = new LinkedBinaryTree<String>("F");
		
		LinkedBinaryTree<String> b = new LinkedBinaryTree<String>("B",c,d);
		LinkedBinaryTree<String> e = new LinkedBinaryTree<String>("E",f,null);

		LinkedBinaryTree<String> a = new LinkedBinaryTree<String>("A",b,e);

		
		System.out.println("toString(): " + a);
		System.out.println("getHeight() = " + a.getHeight());
		System.out.println("size() = " + a.size());
		System.out.println("getLeft() of A: " + a.getLeft().getRootElement());
		System.out.println("getRight() of A: " + a.getRight().getRootElement());
		if ( (a.contains("A")) && (a.contains("B")) && (a.contains("D")) && (a.contains("E")) && (a.contains("Z") == false)) {
			System.out.println("contains() works!");
		}
		else
			System.out.println("contains() does not work!");
		System.out.println();
		
		System.out.print ("Pre-order traversal: ");
		Iterator<String> pre = a.iteratorPreOrder();
		while (pre.hasNext()) {
			System.out.print (pre.next());
		}
		System.out.println();

		System.out.print ("In-order traversal: ");
		Iterator<String> in = a.iteratorInOrder();
		while (in.hasNext()) {
			System.out.print (in.next());
		}
		System.out.println();

		System.out.print ("Post-order traversal: ");
		Iterator<String> post = a.iteratorPostOrder();
		while (post.hasNext()) {
			System.out.print (post.next());
		}
		System.out.println();

	}

}
