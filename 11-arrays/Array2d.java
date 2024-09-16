
class Array2d {

    public static void main(String[] a) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        // diff way to deal with arrays
        // make sure you put "n[]"
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println("");
        }

    }
}
