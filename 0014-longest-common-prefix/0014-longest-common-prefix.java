class Solution {
    public String longestCommonPrefix(String[] strs) {
      
// Imtialise an empty string to store the longest common prefix
StringBuilder str = new StringBuilder();

//Then sort the array lexicographically
Arrays.sort(strs);
String s1 = strs[0];
String s2 = strs[strs.length-1];
for(int i =0; i<Math.min(s1.length(), s2.length());i++){
    if (s1.charAt(i) != s2.charAt(i)){
        return str.toString();
    }
     str.append(s1.charAt(i));
   
}
 return str.toString();

}
}