// https://leetcode.com/problems/find-words-containing-character/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int l=0;
List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    if(!arr.contains(i))
                    arr.add(i);
                }
            }
        }
        return arr;
    }
}