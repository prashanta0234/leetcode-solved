// https://leetcode.com/problems/find-the-difference/description/

class Solution {
    public static char findTheDifference(String s, String t) {
        char[] tArray=t.toCharArray();
        char[] sArray=s.toCharArray();
        Arrays.sort(tArray);
        Arrays.sort(sArray);
        int n = s.length();
        for(int i=0; i<n; i++) if(sArray[i]!=tArray[i]) return tArray[i];
        return tArray[n];
    }
}