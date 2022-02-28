public class BinarySearchTree {
    public int nodeValue;
    public BinarySearchTree left;
    public BinarySearchTree right;
    public BinarySearchTree(int value) {
    }
    public BinarySearchTree getLeft() {
        return left;
    }
    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }
    public BinarySearchTree getRight() {
        return right;
    }
    public void setRight(BinarySearchTree right) {
        this.right = right;}
    public boolean binarySearch(BinarySearchTree node, int searchValue)
    {
        if(node == null)
        {
            return false;
        }
        if(searchValue == node.nodeValue)
        {
            return true;
        }
        else if (searchValue < node.nodeValue)
        {
            return binarySearch(node.left, searchValue);
        }
        else
        {
            return binarySearch(node.right, searchValue);
        }
    }

    public void binaryInsert(int value)
    {
        BinarySearchTree current = this;
        while (current != null)
        {
            if(value < current.nodeValue)
            {
                if(current.left == null)
                {
                    current.left = new BinarySearchTree(value);
                    break;
                }
                else
                    current = current.left;
            }
            else if(value > current.nodeValue)
            {
                if(current.right == null)
                {
                    current.right = new BinarySearchTree(value);
                    break;
                }
                else
                    current = current.right;
            }
            else
            {
                break;
            }
        }
    }

}  

