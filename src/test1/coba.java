
package test1;

public class coba {

    public static void main(String[] args) {
        
        int[][] nums =  {{5},
                 {1,4},
                 {2,7,8},
                 {7,3,6,2}};
        int[][] copy = new int[nums.length][];

        for (int i = 0; i < nums.length; i++) {
            copy[i] = new int[nums[i].length];
            System.arraycopy(nums[i], 0, copy[i], 0, nums[i].length);
        }
        for(int[] a:copy){
            for (int i = 0; i < copy[0].length; i++) {
                System.out.println(a[i]);
            }
        }
    }         
}
