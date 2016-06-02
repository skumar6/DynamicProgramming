/**
 * Created by Sanjeev on 6/2/2016.
 */
public class SubsetSum {

    public static boolean subsetsum(int[] coins, int target){
        boolean[][] t = new boolean[coins.length+1][target+1];
        for(int i =0; i<=coins.length; i++) t[i][0]=true;
       // t[0][coins[0]]=true;

        for(int i=1; i<=coins.length; i++ ){
            for(int j = 1; j<target+1; j++){
                if(coins[i-1] <= j)
                    t[i][j] = t[i-1][j] || t[i-1][j-coins[i-1]];
                else
                t[i][j] = t[i-1][j];
            }
        }
        return t[coins.length][target];
    }

    public static void main(String[] args){
        int[] arr = {2,3,8};
        System.out.println(subsetsum(arr, 10));
    }
}
