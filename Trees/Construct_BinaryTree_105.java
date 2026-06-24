class Solution {

    int idx = 0; 

    TreeNode solve(int[] preorder , int[] inorder , int start , int end ) {
       
        if(start > end) {
            return null;
        }

        int rootNode = preorder[idx];
        idx++;
        int i = start;

        for( i = start ; i<end ; i++) {
            if(inorder[i] == rootNode) {
                break;
            }
        }

        TreeNode root = new TreeNode(rootNode);

        root.left = solve(preorder , inorder , start , i-1 );
        root.right = solve(preorder , inorder , i+1 , end );

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return solve(preorder , inorder , 0 , n-1 );
    }
}