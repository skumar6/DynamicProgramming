/**
 * Created by Sanjeev on 5/10/2016.
 */
public class RodCuttingHandler {

    public static void main(String[] args) {
        int[] price = {2,5,7,8};
        System.out.println("checking commit ");
        RodCutting rc = new RodCutting();
        System.out.println(rc.maxValue(price, 5));

    }
}
