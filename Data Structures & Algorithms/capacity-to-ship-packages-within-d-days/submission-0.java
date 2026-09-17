class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for(int weight : weights){
            l = Math.max(l, weight);
            r += weight;
        }
        int res = r;

        while(l <= r){
            int m = (l + r) / 2;
            if(canShip(weights, days, m)){
                res = Math.min(res, m);
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return res;
    }

    private boolean canShip(int[] weights, int days, int cap){
        int ships = 1, currCap = cap;
        for(int weight : weights){
            if(currCap - weight < 0){
                ships++;
                if(ships > days){
                    return false;
                }
                currCap = cap;
            }
            currCap -= weight;
        }
        return true;
    }
}