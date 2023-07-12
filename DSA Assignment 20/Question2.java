package in.ineuron.main;


public class Question2 {


	public static class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val=val;
		}
	}
	public static int maximumSumOfSubTree(Node root,int max) {
		if(root==null)
			return 0;
		int sum=0;
		sum =root.val+maximumSumOfSubTree(root.left,max)+maximumSumOfSubTree(root.right,max);
		return Math.max(max, sum);
	}
	public static void main(String[] args) {
		Node a=new Node(1);
		Node b=new Node(-2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		Node f=new Node(-6);
		Node g=new Node(2);
	
		a.left=b;
		b.left=d;
		b.right=e;
		a.right=c;
		c.left=f;
		c.right=g;
		int max=Integer.MIN_VALUE;
		System.out.println(maximumSumOfSubTree(a, max));
	}

}