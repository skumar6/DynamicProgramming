/**
 * Created by Sanjeev on 12/9/2016.
 */
public class MaxSumIncSeq {

    public static int maxSumIncSeq(int[] arr, int n){
        //this is a variation of LIS problem.
        //change the condition to check the sum
        int[] res = new int[n];
        int i, j, max =0;

        for ( i = 0; i < n; i++ )
            res[i] = arr[i];

        for ( i=1 ; i<n; i++){
            for(j =0; j<=i; j++){
                if(arr[i] > arr[j] && res[i]<arr[i]+res[j]){
                    res[i]=arr[i]+res[j];
                }
            }
        }
        for(i =0; i<n; i++) {
            System.out.print(res[i] + " ");
            if (max < res[i])
                max = res[i];
        }

        System.out.println();
        return max;

    }


    public static void main(String[] args){
        int[] arr = {1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.print(maxSumIncSeq(arr, n));
    }

}
