/**
 * Created by Sanjeev on 12/9/2016.
 */
public class RodCutting {
    //given an array of rod length values and index+1 as length.
    //find best way to cut the rod as maximize the value, and return the maximum value.
    //n is length.
    public static int rodCuttingRec(int[] price, int n){
        if(n<=0) return 0;
         int max = Integer.MIN_VALUE;

        //recursively cut the rod at different length(i), and calculate the maximum value
        for(int i=0; i<n ; i++){
            max = Math.max(max, price[i]+rodCuttingRec(price, n-1-i));
        }

        return max;
    }


    public static int rodCuttingDyn(int[] price, int n){
        //make an array of length n+1
        int[] val = new int[n+1];
        int max_val = Integer.MIN_VALUE;
        for(int i =1; i<=n; i++){
            for(int j =0; j<i; j++){
                max_val= Math.max(max_val, price[j]+val[i-j-1]);

                val[i]= max_val;
            }
        }
        return val[n];
    }

    public static void main(String[] args){
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;
        System.out.println(rodCuttingDyn(price, n));
    }
}
