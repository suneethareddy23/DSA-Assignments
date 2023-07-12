package in.ineuron.main;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution3 {
    public TreeNode str2tree(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        int indexOfOpeningParenthesis = s.indexOf("(");
        int rootValue = Integer.parseInt(s.substring(0, indexOfOpeningParenthesis));
        TreeNode root = new TreeNode(rootValue);

        int indexOfClosingParenthesis = findClosingParenthesisIndex(s, indexOfOpeningParenthesis);
        String leftSubstring = s.substring(indexOfOpeningParenthesis + 1, indexOfClosingParenthesis);
        root.left = str2tree(leftSubstring);

        if (indexOfClosingParenthesis < s.length() - 1) {
            String rightSubstring = s.substring(indexOfClosingParenthesis + 2, s.length() - 1);
            root.right = str2tree(rightSubstring);
        }

        return root;
    }

    private int findClosingParenthesisIndex(String s, int openingParenthesisIndex) {
        int count = 0;
        for (int i = openingParenthesisIndex; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }

            if (count == 0) {
                return i;
            }
        }

        return -1;
    }
}
public class Question4{
    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";

        Solution3 solution = new Solution3();
        TreeNode root = solution.str2tree(s);
        printTree(root); 
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
    }
}



