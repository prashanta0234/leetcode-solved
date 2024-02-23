// https://leetcode.com/problems/reverse-string/description/

class Solution {
    public void reverseString(char[] s) {
       reverse(s,0,s.length-1);
        
    }
    public static void reverse(char[] arr,int s,int e){
        while(e>s){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            e--;
            s++;
        }
    }
}