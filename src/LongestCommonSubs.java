/**
 * Created by Sanjeev on 7/26/2016.
 */
public class LongestCommonSubs {

    public static void main(String args[]){
        String s1 = "AGGTAB";
        String s2 =  "GXTXAYB";

        System.out.println(lcsRecursive(s1, s2));
        System.out.println(dynamicLcs(s1, s2));

    }
    //recursive, inefficient, time-complexity 2^n.
    public static int lcsRecursive(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1==0 || l2==0){
            return  0;
        }

        if(s1.charAt(l1-1)==s2.charAt(l2-1))
            return 1+ lcsRecursive(s1.substring(0,l1-1), s2.substring(0, l2-1));
        else
            return Math.max(lcsRecursive(s1.substring(0,l1-1), s2.substring(0, l2)), lcsRecursive(s1.substring(0,l1), s2.substring(0, l2-1)));

    }

    public static int dynamicLcs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int i, j;

        int[][] l = new int[m+1][n+1];
        for(i =0; i<=m; i++){
            for(j =0; j<=n; j++){
                if(i==0 || j==0){
                    l[i][j]=0;
                }
               else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    l[i][j] = 1+l[i-1][j-1];
                }
                else
                    l[i][j]= Math.max(l[i][j-1], l[i-1][j]);

                }
            }

            return l[m][n];
        }


}
