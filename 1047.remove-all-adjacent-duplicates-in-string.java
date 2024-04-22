// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
           
          if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));

            } else {

                stack.pop();
              
            }
        }
        char[] charArray=new char[stack.size()];
        

         int index = stack.size()-1;
        while(!stack.isEmpty()){
            charArray[index--]=stack.pop();

        }
        return new String(charArray);
    }
}