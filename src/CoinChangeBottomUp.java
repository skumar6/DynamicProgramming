/**
 * Created by Sanjeev on 6/2/2016.
 */
public class CoinChangeBottomUp {
    //givrn an array of coins, find minm coins to add up to a target

    public static int coinChange(int[] coins, int target){
        int[] t = new int[target+1];
        int[] r = new int[target+1];
        for(int i=0; i<=target; i++){
            t[i]= Integer.MAX_VALUE-1;
            r[i]=-1;
        }
        t[0]=0;
        for(int i=0; i<coins.length;i++){
            for(int j =1; j<=target; j++){
                if(j>=coins[i]){
                    t[j]= Math.min(t[j],1+ t[j-coins[i]]);
                    r[j]=i;
                }
            }
        }
       // System.out.println("here " + t[target]);
     //   printCombination(coins,r);
        return t[target];
    }

    public static void main(String[] args){
        int[] coins = {7,2,3,6};
        int target =13;

        System.out.println(coinChange(coins, target));

    }

//    public static void printCombination(int[] coins,  int[] r){
//       if(r[r.length-1]==-1){
//           System.out.println("no combination found");
//           return;
//       }
//        int start = r.length-1;
//        System.out.println("coins used are...");
//        while(start != 0){
//            int j = r[start];
//            System.out.println(coins[j]);
//            start = start- coins[j];
//        }
//    }

}
