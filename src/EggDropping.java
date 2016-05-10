/**
 * Created by Sanjeev on 5/10/2016.
 */
public class EggDropping {

    public static void main(String[] args) {
        //having 2 eggs, and checking it out with 100 floors
        System.out.println(countAttempt(2, 100));
    }

    private static int countAttempt(int eggs, int floors){
        int[][] t = new int[eggs+1][floors+1];
        int count =0;
        for(int i=0; i<= floors; i++){
            t[1][i]=i;
        }
        for(int e = 2; e <=eggs; e++){
            for(int f=1; f<=floors; f++){
                t[e][f] = Integer.MAX_VALUE;
                for(int k =1; k<=f; k++ ){
                    count = 1+ Math.max(t[e-1][k-1], t[e][f-k]);
                    if(count< t[e][f]){
                        t[e][f]=count;
                    }
                }
            }
        }
        return t[eggs][floors];
    }
}
