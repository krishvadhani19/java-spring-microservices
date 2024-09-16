
public class ArrayJagged {

    public static void main(String[] args) {
        // Jagged Array
        int nums[][] = new int[3][];

        // Arrays are of diff size
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println("");
        }
    }
}
