class Solution {
    public int lengthOfLongestSubstring(String s) {
        String fin="";
        int max=0;
        int j=0;
        
        for (int i=0;i<s.length();i++){
            if(fin.indexOf(s.charAt(i))==-1){
                fin=fin.concat(""+s.charAt(i));
            }else{
                j++;
                i=j-1;
                if(fin.length()>max)
                    max=fin.length();
                fin="";
            }
        }
       if(fin.length()>max)
            max=fin.length();
       
        return max;
    }
}