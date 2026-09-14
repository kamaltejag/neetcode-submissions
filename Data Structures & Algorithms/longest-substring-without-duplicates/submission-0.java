class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int lp = 0;
        int res = 0;
        for(int rp = 0; rp < s.length(); rp++){
            while(hashSet.contains(s.charAt(rp))){
                hashSet.remove(s.charAt(lp));
                lp++;
            }
            hashSet.add(s.charAt(rp));
            res = Math.max(res, rp - lp + 1);
        }
        return res;
    }
}
