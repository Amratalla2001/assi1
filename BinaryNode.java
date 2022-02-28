public class BinaryNode {
    public Object nodeValue;
    public BinaryNode left;
    public BinaryNode right; 

    public BinaryNode(Object nodeValue) {
        this.nodeValue = nodeValue;
        left = null;
        right = null;
    }
    public Object getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(Object nodeValue) {
        this.nodeValue = nodeValue;
    }
    public BinaryNode getLeft() {
        return left;
    }
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public BinaryNode getRight() {
        return right;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void inOrderTraversal(BinaryNode node)
    {
        if(node != null)
        {
            if(node.left != null)
            {
                inOrderTraversal(node.left);
            }
            System.out.println(node.nodeValue);
            if(node.right != null)
            {
                inOrderTraversal(node.right);
            }
        }
    }
    public void binaryInsert(Object i) {
    }
    public boolean binarySearch(BinaryNode root, Object i) {
        return false;
    }
}