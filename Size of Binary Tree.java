// https://www.geeksforgeeks.org/problems/size-of-binary-tree/1?utm_source=gfg

class Solution {
    public static int getSize(Node node) {
        // code here
        
        if(node==null){
            return 0;
        }
        int a= getSize(node.left);
        int b= getSize(node.right);
        
        return a+b+1;
    }
    

}