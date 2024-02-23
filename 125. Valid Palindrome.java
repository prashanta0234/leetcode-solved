// https://leetcode.com/problems/valid-palindrome/description/

// brute-force
class Solution {
    public boolean isPalindrome(String s) {
        
        char[] arr=s.toCharArray();
        if(arr.length==1){
            return true;
        }
        String str="";
        for(int i=0;i<arr.length;i++){
            if ((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= '0' && arr[i] <= '9')){
                if(arr[i]<=90){
                str=str+(char)(arr[i]+32);
            }else{
              str=str+arr[i];
                }
            }
            
        }
        char[] arr1=str.toCharArray();
        boolean ans= reverse(arr1,0,arr1.length-1);
        return ans;

    }
    public static boolean reverse(char[] arr,int s,int e){
        while(e>s){
            if(arr[s]!=arr[e]){
                return false;
            }
            e--;
            s++;
        }
        return true;
    }
}

// more optimized

class Solution {
    public boolean isPalindrome(String s) {

        if(s.length()==1){
            return true;
        }
       List<Character> chars = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                if(s.charAt(i)<=90){
                chars.add((char)(s.charAt(i)+32));
            }else{
              chars.add(s.charAt(i));
                }
            }
            
        }
        boolean ans= reverse(chars,0,chars.size()-1);
        return ans;

    }
    public static boolean reverse(List<Character> arr,int s,int e){
        while(e>s){
            if(arr.get(s)!=arr.get(e)){
                return false;
            }
            e--;
            s++;
        }
        return true;
    }
}