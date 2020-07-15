package Algorithm;

public class BinaryTree {

    public static void main(String[] args) {

        TreeNode root = null;

        int[] values = {1, 2, 3};

        for(int value: values){
            if (root == null){
                root = new TreeNode(value);
            } else{
                root.addNode(value);
            }
        }

        root.printInOrder();
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void addNode(int value){
        if(value <= this.val){
            if(this.left != null){
                this.left.addNode(value);
            }
            else{
                this.left = new TreeNode(value);
            }
        } else{
            if(this.right != null){
                this.right.addNode(value);
            }
            else{
                this.right = new TreeNode(value);
            }
        }
    }

    public void printInOrder(){


        if(this.left != null){
            left.printInOrder();
        }
        System.out.println(this.val);
        if(this.right != null){
            right.printInOrder();
        }
    }


  }
