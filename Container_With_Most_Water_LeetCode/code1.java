class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=0;j<height.length;j++){
                int p=Math.min(height[i],height[j])*(Math.max(i,j)-Math.min(i,j));
                if(max<p)
                    max=p;
            }
        }
        return max;
    }
}