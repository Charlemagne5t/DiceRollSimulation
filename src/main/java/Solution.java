public class Solution {
    public int dieSimulator(int n, int[] rollMax) {
        //Map<String, Integer> memo = new HashMap<>();
        Integer[][][] memo = new Integer[n + 1][16][8];
        int res = dfs(n, rollMax, 0, 6  , memo);

        return res;
    }

    private int dfs(int n, int[] rollMax, int streak, int previous, Integer[][][] memo) {
        if (n == 0) {
            return 1;
        }
        if(memo[n][streak][previous] != null)    {
            return memo[n][streak][previous];
        }
        int mod = 1_000_000_007;
        int result = 0;
        for (int i = 0; i < 6; i++) {
            if(i == previous){
                if(rollMax[i] - streak > 0){
                    streak++;
                    result = (result + dfs(n - 1, rollMax, streak, i, memo) % mod ) % mod;
                    streak--;
                }
            }else {
                result = (result + dfs(n - 1, rollMax, 1,i, memo) % mod ) % mod;
            }
        }
        memo[n][streak][previous] = result % mod;
        return result % mod;
    }
}
