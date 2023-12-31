class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,ans=0;
        while(i<g.length && j<s.length){
            if(i<g.length && g[i]<=s[j]){
                ans++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return ans;
    }
}