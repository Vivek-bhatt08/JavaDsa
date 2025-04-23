package April21.TotalNodes;

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
public class NodeCount {
    static int numberOfNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
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

        System.out.print("count using function: ");
        int c = numberOfNodes(root);
        System.out.println(c);

        System.out.print("count of Nodes using static keyword: ");
        System.out.println(TreeNode.count);
    }

}




