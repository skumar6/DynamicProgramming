/**
 * Created by Sanjeev on 6/2/2016.
 */
public class LongestIncreasingSubsLen {
    public static void main(String[] args){
        //given an array of an integer find the length of
        //longest increasig subsequence
        int[] arr = {3,4,-1,0,6,2,3};
        int[] temp = new int[arr.length];
        int len = Integer.MIN_VALUE;
        for(int i =0; i<temp.length; i++)
            temp[i]=1;
        for(int i=1; i<arr.length; i++){
            for(int j =0; j<temp.length; j++){
                if(arr[j]<arr[i]) {
                    temp[i] = Math.max(temp[i], temp[j] + 1);
                    if(temp[i]>len) len = temp[i];
                }

            }
        }
        System.out.println(len);
    }
}
