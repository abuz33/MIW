package nl.hva.miw.ads.tree;

public class TreeNode<T extends Comparable<T>> {
	
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(T value) {
		this(value, null, null);
	}

	public boolean isLeaf() {
		return (this.left==null) && (this.right==null);
	}
	
	
	/*
	 * Hieronder volgen alleen nog getters en setters.
	 */

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
}
