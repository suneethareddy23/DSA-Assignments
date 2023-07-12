package in.ineuron.main;

import java.util.LinkedList;
import java.util.Queue;

public class Question1{
	public static class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val=val;
		}
	}

	public static void main(String[] args) {
		int arr[] = {7, 4, 12, 3, 6, 8, 1, 5, 10};
		Node root=new Node(arr[0]);
		
		constructBST(root,arr);

	}

	public static Node constructBST(Node root,int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            
            if (i < arr.length && arr[i] < current.val) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
                i++;
            }

            if (i < arr.length && arr[i] > current.val) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
                i++;
            }
        }

        return root;
    }


}