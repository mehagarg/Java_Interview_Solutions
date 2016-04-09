package BinarySearchTree;

import java.util.ArrayList;

public class TestBST {

	public static void main(String[] args) {
		BSTOperations bstOper = new BSTOperations();
		BSTNode root = new BSTNode(10);
		bstOper.insertRecursive(root, 5);
		bstOper.insertRecursive(root, 15);
		bstOper.insertRecursive(root, 8);
		bstOper.insertRecursive(root,18);
		
		System.out.println("---InorderTraversal----");
		bstOper.InorderTraversal(root);
		
		System.out.println("---PreorderTraversal----");
		bstOper.PreorderTraversal(root);
		
		System.out.println("--PostorderTraversal-----");
		bstOper.PostorderTraversal(root);
		
		System.out.println("--LevelorderTraversal-----");
		bstOper.LevelorderTraversal(root);
		
		System.out.println("----LevelorderTraversalinList---");
		ArrayList<ArrayList<Integer>> result = bstOper.LevelorderTraversalinList(root);
		for(ArrayList<Integer> val : result){
			System.out.println(val);
		}
		
		System.out.println("----ReverseLevelorderTraversalinList---");
		ArrayList<ArrayList<Integer>> revOrderresult = bstOper.ReverseLevelorderTraversalinList(root);
		for(ArrayList<Integer> val : revOrderresult){
			System.out.println(val);
		}

		
	}

}
