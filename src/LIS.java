/**
 * Created by Sanjeev on 12/9/2016.
 */
public class LIS {
    //Longest Increasing subsequence
    //given an array find length of longest Increasing Subsequnece.
    public static int lis(int[] p){
        int n = p.length;
        if(n<=1) return n;
        int[] l = new int[n];
        int max=0;
        int ele =0;

        //Initalize the array element with 1.
        for(int i =0; i<n; i++){
            l[i] = 1;
        }
        for(int i=1; i<n;i++){
            for(int j =0; j<i; j++){
                if(p[i]>p[j]  &&  l[i]<l[j]+1){
                    l[i]=l[j]+1;
                }
            }
        }

        for(int i =0; i<n; i++){

            if(l[i]>ele) {
                System.out.print(p[i] + " ");
                ele = l[i];
            }
            if(max < l[i])
                max = l[i];
        }
        System.out.println(" ");
        return max;
    }


    public static void main(String [] args){
        int[] p = {10, 20, 9, 33, 21, 50, 41, 60};
        System.out.println(lis(p));
    }
}
