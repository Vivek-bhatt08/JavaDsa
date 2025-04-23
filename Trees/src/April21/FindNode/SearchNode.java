package April21.FindNode;


class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class SearchNode {
    static boolean search(TreeNode root, int k){
        if(root==null) return false;
        if(root.data ==k) return true;
        return search(root.left,k) || search(root.right,k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left =  new TreeNode(8);
        root.left.left.right =  new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        root.left.right.right= new TreeNode(11);

        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);

        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        System.out.println(search(root,12));
        System.out.println(search(root,16));
    }
}
