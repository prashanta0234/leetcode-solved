// https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1?utm_source=gfg

class BinaryTree
{
    static int sumBT(Node head){
        //Code
        
        if(head==null){
            return 0;
        }
        
        int a= sumBT(head.left);
        int b=sumBT(head.right);
        return a+b+head.data;
    }
}