/**
 * Created by Sanjeev on 7/26/2016.
 */
public class MinmEditDistance {

    public static void main(String args[]){
        String s1 = "sunday";
        String s2 = "saturday";
        System.out.println(med(s1,s2));
    }

    /* the idea is to use tabular method and record cost
    start from either end, if chars are same, cost would be same
    as diagonally apposite cost, other wise take min of insert(i, j-1),
    remove(i-1, j) and replace(i-1, j-1) and add one to it as it ll cost
    at least one. make the table and then cost is evident, d[m][n] ll
    return the final cost.
     */
    public static int med(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] d = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i ==0)
                    d[i][j] = j;
                else if(j ==0)
                    d[i][j]=i;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    d[i][j]=d[i-1][j-1];
                else
                    d[i][j]=1+ Math.min( d[i-1][j-1], Math.min(d[i-1][j],d[i][j-1]));
            }
        }
        return d[m][n];
    }



}

