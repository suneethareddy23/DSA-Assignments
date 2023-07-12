package in.ineuron.main;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Question4 {
    Node root;

    Question4() {
        root = null;
    }

    boolean checkSameTree(int[] inorder, int[] preorder, int[] postorder) {
        int n = inorder.length;
        int m = preorder.length;
        int p = postorder.length;

        if (n != m || m != p)
            return false;

        return checkSameUtil(inorder, 0, n - 1, preorder, 0, m - 1, postorder, 0, p - 1);
    }

    boolean checkSameUtil(int[] inorder, int inStart, int inEnd,
                          int[] preorder, int preStart, int preEnd,
                          int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || preStart > preEnd || postStart > postEnd)
            return true;

        int rootData = preorder[preStart];
        int rootIndex = -1;

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        if (rootIndex == -1)
            return false;

        int leftSubtreeSize = rootIndex - inStart;

        boolean isLeftSame = checkSameUtil(inorder, inStart, rootIndex - 1,
                preorder, preStart + 1, preStart + leftSubtreeSize,
                postorder, postStart, postStart + leftSubtreeSize - 1);

        boolean isRightSame = checkSameUtil(inorder, rootIndex + 1, inEnd,
                preorder, preStart + leftSubtreeSize + 1, preEnd,
                postorder, postStart + leftSubtreeSize, postEnd - 1);

        return (isLeftSame && isRightSame);
    }
}