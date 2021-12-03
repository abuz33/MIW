package nl.hva.miw.ads.tree;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	private void run() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i=1; i<16; i++) {
			values.add(i);
		}
		Collections.shuffle(values);

		BinaryIntegerTree tree = new BinaryIntegerTree(values);
		tree.printTree();
		
		System.out.println();
		System.out.println("Aantal leaves in deze boom is " + tree.countLeafNodes());

		System.out.println();
		System.out.println("Som van de waardes in deze boom is " + tree.sumAllNodes());
	}
}
