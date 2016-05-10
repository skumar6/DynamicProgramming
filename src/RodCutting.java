/**
 * Created by Sanjeev on 5/10/2016.
 */
public class RodCutting {

    static int[] price;
    public static void main(String[] args) {
        int[] price = {2,5,7,8};
        System.out.println(maxValue(price, 5));

    }

    private static int maxValue(int[] price, int length){
        int[][] m = new int[price.length][length+1];
        for(int k =0; k<price.length; k++){
            m[k][0] = 0;
        }
        for(int k =0 ; k< length+1; k++){
            m[0][k] = k*2;
        }
        for(int i = 1; i< price.length; i++){
            for(int j = 1 ; j<length+1; j++){
                if(j>=i){
                    m[i][j] = Math.max(m[i-1][j], m[i][j-i]+ price[i-1]);
                    System.out.print(" "+ m[i][j]);
                }else{
                    m[i][j]= m[i-1][j];
                    System.out.print(" "+ m[i][j]);
                }


            }
            System.out.println("");

        }
        return m[price.length-1][length];
    }
}
