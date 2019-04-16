class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String>fin=new ArrayList<String>();
        int j=0;
        fin.add("");
        
        for (int i=0;i<s.length();i++){
            if(fin.get(j).indexOf(s.charAt(i))==-1){
                fin.set(j,fin.get(j).concat(""+s.charAt(i)));
               
            }else{
                j++;
                i=j;
                fin.add(""+s.charAt(i));
            }
           
        }
        int max=0;
        for(String i : fin){
            if(i.length()>max)
                max=i.length();
        }
        return max;
    }
}