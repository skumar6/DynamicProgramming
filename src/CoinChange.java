/**
 * Created by Sanjeev on 12/9/2016.
 */
public class CoinChange {
    //give an array of coin values s[] and a sum n, find how many ways sum n can be reached.
    //given multiple coin of a value can be used.
    /*
    * there are two point to note:
    * 1. a particular coin denomination is not included at all.
    * 2. at least on coin of a particular value is always included.
    *
    * */
    public static int coinChangeRec(int[] s, int m , int n){
        if(n ==0)  return 1;
        if(n < 0)  return 0;
        if(m<=0 && n>=1) return 0;

        return coinChangeRec(s, m-1, n) + coinChangeRec(s, m, n - s[m-1]);
    }

    public static int coinChangeDyn(int[] s, int m, int n){
        //take a table length just greater than n(sum) and cz considering base case 0;
        int[] table = new int[n+1];
        table[0]=1;
        for(int i=0; i<m; i++){
            for(int j=s[i]; j<=n; j++){
                table[j] = table[j]+table[j-s[i]];
            }
        }
        return table[n];
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        int n =4;
        System.out.println(coinChangeDyn(arr, 3,n));
    }

}
