/**
 * Created by Sanjeev on 6/2/2016.
 */
public class ArrayHooper {
    //given an array with intgers find minm #  jumbs to reach the end
    public static int jumper(int[] arr){
        int[] n = new int[arr.length];
        int[] k = new int[arr.length];
        for(int i =0; i<n.length; i++){
            n[i]= Integer.MAX_VALUE;
        }
        n[0]=0;
        for(int i =1; i<arr.length; i++){
            for(int j =0; j<i; j++){
                if(arr[j]+j >= i){
                    if(n[i]>i+n[j]) {
                        n[i] =  1 + n[j];
                        k[i] = j;
                    }
                }
            }

        }
        visitedNodes(k);
        System.out.print("no of jumps = ");
        return n[n.length-1];
    }

    private static void visitedNodes(int[] k) {
        int index = k.length-1;
        System.out.print("visited nodes...");
        while(index != 0){
            System.out.print(" "+k[index]);
            index = k[index];
        }
        System.out.println(" ");

    }

    public static void main(String[] args){
        int[] arr = {2,3,1,1,2,4,2,0,1,1};
        System.out.println(jumper(arr));
    }

}
