class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int min = r;

        while(l <= r){
            int m = (l + r) / 2;
            long total = 0;
            for(int pile : piles){
                total += Math.ceil((double)pile / m);
            }

            if(total <= h){
                min = m;
                r = m - 1;
            }else{
                l = m + 1;
            }
        }

        return min;
    }
}
