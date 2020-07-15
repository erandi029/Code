package problems;

/*

DP bottom up

iterate through the amounts:

For each amount : Iterate through each coin to what is the best we can do if this was the last coin to add.



 */

import java.util.Arrays;

public class DP_coinchange {
    public int coinChange(int[] coins, int amount) {

        int[] track = new int[amount+1];
        Arrays.fill(track, amount+1);

        track[0] = 0;

        for(int i = 1 ; i <= amount ; i++){
            for(int coin: coins){
                if(coin <= i){
                    track[i] = Math.min(track[i], track[i-coin]+1);
                }
            }
        }

        return track[amount] <= amount ? track[amount] : -1;

    }
}

