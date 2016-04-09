package BinarySearchTree;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class BSTOperations {
	BSTNode newNode = new BSTNode();

	public BSTOperations() {

	}
	
	
	// ----------------      search Recursively
	public static boolean searchRecursive(BSTNode root, int target){
		if(root == null){
			return false;
		}
		if(root!=null){
			if(root.val == target){
				return true;
			}
			if(root.val < target){
				searchRecursive(root.left, target);
			}
			if(root.val > target){
				searchRecursive(root.right, target);
			}
		}
		return false;
	}
	
	// ----------------      search Iteratively
	public static boolean searchIterative(BSTNode root, int target){
		BSTNode ptr = root;

		while(ptr!=null){
			if(ptr.val == target){
				return true;
			}
			if(ptr.val > target){
				// insert item to left
				ptr = ptr.left;
			}
			else{
				// insert item to right
				ptr = ptr.right;
			}
		}
		return false;
	}
	
	// ----------------      insert Iterative 
	public static BSTNode insertRecursive(BSTNode root, int target){	
		BSTNode ptr = root;
		BSTNode prev = null;
		boolean left = false;
		
		while(ptr!=null){
			if(ptr.val == target){
				throw new IllegalArgumentException();
			}
			// keep previous pointer to the parent
			prev = ptr;
			if(ptr.val > target){
				// insert item to left
				ptr = ptr.left;
				// keep flag to know if we moved left
				left = true;
			}
			else{
				// insert item to right
				ptr = ptr.right;
				left = false;
			}
		}
		BSTNode node = new BSTNode(target);
		if(left){
			prev.left = node;
		} else{
			prev.right = node;
		}
		return root;
	}
	
	// ----------------      Inorder Traversal  Recursive
	public void InorderTraversal(BSTNode root){
		if(root!=null){
			if(root.left!=null){
				InorderTraversal(root.left);
			}
			System.out.println(root.val);
			if(root.right!=null){
				InorderTraversal(root.right);
			}
		}
	}
	
	// ----------------      PreOrder Traversal 
	public void PreorderTraversal(BSTNode root){
			if(root!=null){
				System.out.println(root.val);
				
				if(root.left!=null){
					PreorderTraversal(root.left);
				}
				
				if(root.right!=null){
					PreorderTraversal(root.right);
				}
			}
		}
		
	// ----------------      PostOrder Traversal 
	public void PostorderTraversal(BSTNode root){
					if(root!=null){			
						if(root.left!=null){
							PostorderTraversal(root.left);
						}
						if(root.right!=null){
							PostorderTraversal(root.right);
						}
						System.out.println(root.val);
					}
				}
				
	// ----------------      LevelOrder Traversal 
	public void LevelorderTraversal(BSTNode root){
					if(root == null){
						return;
					}
					LinkedList<BSTNode> queue = new LinkedList<BSTNode>();
					queue.add(root);
					
					while(!queue.isEmpty()){
						BSTNode temp = queue.poll();
						System.out.println(temp.val);
						
						if(temp.left!=null){
							queue.add(temp.left);
						}
						
						if(temp.right!=null){
							queue.add(temp.right);
						}
					}
					
				}

	// ----------------      LevelOrder Traversal with List wise.
	public static ArrayList<ArrayList<Integer>> LevelorderTraversalinList(BSTNode root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null){
			return result;
		}
		LinkedList<BSTNode> nextQueue = new LinkedList<BSTNode>();
		LinkedList<BSTNode> currentQueue = new LinkedList<BSTNode>();
		ArrayList<Integer> nodeValues = new ArrayList<Integer>();
		currentQueue.add(root);
	
					
		while(!currentQueue.isEmpty()){
			BSTNode temp = currentQueue.poll();
			nodeValues.add(temp.val);
						
			if(temp.left!=null){
				nextQueue.add(temp.left);
			}
						
			if(temp.right!=null){
				nextQueue.add(temp.right);
			}
			
			if(currentQueue.isEmpty()){
				currentQueue = nextQueue;
				nextQueue = new LinkedList<BSTNode>();
				result.add(nodeValues);
				nodeValues = new ArrayList<Integer>();
			}
		}
		return result;
	}
	
	
	// ----------------      LevelOrder Traversal with List wise.
	public static ArrayList<ArrayList<Integer>> ReverseLevelorderTraversalinList(BSTNode root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null){
			return result;
		}
		LinkedList<BSTNode> nextQueue = new LinkedList<BSTNode>();
		LinkedList<BSTNode> currentQueue = new LinkedList<BSTNode>();
		ArrayList<Integer> nodeValues = new ArrayList<Integer>();
		currentQueue.add(root);
	
					
		while(!currentQueue.isEmpty()){
			BSTNode temp = currentQueue.poll();
			nodeValues.add(temp.val);
						
			if(temp.left!=null){
				nextQueue.add(temp.left);
			}
						
			if(temp.right!=null){
				nextQueue.add(temp.right);
			}
			
			if(currentQueue.isEmpty()){
				currentQueue = nextQueue;
				nextQueue = new LinkedList<BSTNode>();
				result.add(nodeValues);
				nodeValues = new ArrayList<Integer>();
			}
		}
		
		ArrayList<ArrayList<Integer>> revResult = new ArrayList<ArrayList<Integer>>();
		for(int i=result.size()-1; i>=0; i--){
			revResult.add(result.get(i));
		}
		return revResult;
	}
	


}
