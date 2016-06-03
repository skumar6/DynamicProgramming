/**
 * Created by Sanjeev on 6/3/2016.
 */
public class MaxSumIncreaingSubsequence {
    //like other sequence probelems, we ll take two extra arrays,
    //one to keep track of sum, and another to locate values used in that sum.

    public static int maxSum(int[] input){
        int[] t = new int[input.length];
        int[] r = new int[input.length];
        for(int i =0; i< input.length; i++){
            t[i]=input[i];
            r[i] = i;
        }

        for(int i =1; i<input.length; i++){
            for(int j=0; j<i; j++){
                if(input[j]<input[i]){
                    if(t[j]+input[i] > t[i]){
                        t[i] = t[j]+ input[i];
                        r[i]=j;
                    }

                }
            }

        }
        int max =0;
        int index =0;
        for(int i=0; i<t.length; i++){
            System.out.print(" "+t[i]);
            if(t[i]> max) {
                max = t[i];
                index = i;
            }
        }
        System.out.println("max index is: "+ index);
        for(int i =0; i<r.length; i++){
            System.out.print(" "+ r[i]);
        }
        System.out.println("printing sequence now...");
        sequenceInvolved(r, index, input, max);
        return max;
    }

    public static void sequenceInvolved(int[] r, int index, int[] input, int max){
        int start = index;
        while(max  != 0){
            System.out.print(" "+ input[start]);
            max = max-input[start];
            start = r[start];
        }
    }

    public static void main (String[] args){
        int[] input = {4,6,1,3,8,4,6};
        System.out.println(maxSum(input));
    }
}
