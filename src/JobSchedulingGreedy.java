import java.util.ArrayList;

/**
 * Created by Sanjeev on 12/11/2016.
 */
public class JobSchedulingGreedy {
    public static void main(String[] args){
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;
        jobSchedule(s,f, n);
    }

    public static ArrayList<Integer> jobSchedule(int[] s, int[] f, int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(n==0) return arr;

        int i =0, j=0;
        arr.add(i);
        for(i = 1; i<n ; i++){
            //compare if starttime overlaps i.e smaller than previous finish time.then do nothing else include
            if(s[i]>f[j]) {
                arr.add(i);
                j =i;
            }
        }
        //System.out.print(arr.size());
        for(Integer in: arr){
            System.out.print(in+" ");
        }
        return arr;
    }
}
