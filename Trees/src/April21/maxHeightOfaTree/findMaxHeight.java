package April21.maxHeightOfaTree;

class TreeNode{
    static int count = 0;
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
        count++;
    }
}
public class findMaxHeight {
    public int height(TreeNode root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        findMaxHeight tree = new findMaxHeight();
        int h = tree.height(root);

        System.out.print("Height of the tree: ");
        System.out.println(h);
        System.out.println(TreeNode.count);
    }

}




