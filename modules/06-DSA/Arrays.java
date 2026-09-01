import java.util.*;

public class Arrays {

    public static void main(String[] args) {

        // ============================================================
        // 1. 1D ARRAY (int[])
        // ============================================================

        int[] arr = {10, 20, 30, 40, 50};

        // Size
        int n = arr.length;

        // Access
        int x = arr[2];

        // Update
        arr[2] = 100;

        // Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for loop
        for (int value : arr) {
            System.out.print(value + " ");
        }


        // ============================================================
        // 2. USEFUL ARRAY OPERATIONS
        // ============================================================

        // Sort ascending
        Arrays.sort(arr);

        // Print array
        System.out.println(Arrays.toString(arr));

        // Fill entire array
        Arrays.fill(arr, 0);

        // Fill range [from, to)
        Arrays.fill(arr, 1, 4, 5);

        // Copy array
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Copy range [from, to)
        int[] subArray = Arrays.copyOfRange(arr, 1, 4);

        // Compare two arrays
        boolean same = Arrays.equals(arr, copy);


        // ============================================================
        // 3. ARRAYLIST
        // C++ vector<int> equivalent
        // ============================================================

        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at index
        list.add(1, 15);

        // Access
        int value = list.get(2);

        // Update
        list.set(2, 100);

        // Size
        int size = list.size();

        // Remove by INDEX
        list.remove(2);

        // Remove by VALUE
        list.remove(Integer.valueOf(20));

        // Check existence
        boolean exists = list.contains(10);

        // Find index
        int index = list.indexOf(10);

        // Empty check
        boolean empty = list.isEmpty();

        // Clear
        list.clear();


        // ============================================================
        // 4. ARRAYLIST INITIALIZATION
        // ============================================================

        ArrayList<Integer> nums =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        // Traverse
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        // Enhanced for loop
        for (int num : nums) {
            System.out.print(num + " ");
        }


        // ============================================================
        // 5. ARRAYLIST USEFUL OPERATIONS
        // ============================================================

        // Sort ascending
        Collections.sort(nums);

        // Sort descending
        Collections.sort(nums, Collections.reverseOrder());

        // Reverse
        Collections.reverse(nums);

        // Minimum
        int min = Collections.min(nums);

        // Maximum
        int max = Collections.max(nums);

        // Frequency
        int freq = Collections.frequency(nums, 20);


        // ============================================================
        // 6. 2D ARRAY
        // ============================================================

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Number of rows
        int rows = matrix.length;

        // Number of columns
        int cols = matrix[0].length;

        // Access
        int element = matrix[1][2];

        // Update
        matrix[1][2] = 100;

        // Traverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced traversal
        for (int[] row : matrix) {
            for (int value2 : row) {
                System.out.print(value2 + " ");
            }
            System.out.println();
        }


        // ============================================================
        // 7. CREATE 2D ARRAY
        // ============================================================

        int r = 3;
        int c = 4;

        int[][] grid = new int[r][c];

        // Fill with value
        for (int[] row : grid) {
            Arrays.fill(row, -1);
        }


        // ============================================================
        // 8. JAGGED 2D ARRAY
        // Rows can have different sizes
        // ============================================================

        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        // Safe traversal
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }


        // ============================================================
        // 9. 2D ARRAYLIST
        // C++ vector<vector<int>> equivalent
        // ============================================================

        ArrayList<ArrayList<Integer>> matrixList = new ArrayList<>();

        // Add rows
        matrixList.add(new ArrayList<>());
        matrixList.add(new ArrayList<>());

        // Add elements
        matrixList.get(0).add(10);
        matrixList.get(0).add(20);

        matrixList.get(1).add(30);
        matrixList.get(1).add(40);

        // Access
        int val = matrixList.get(0).get(1);

        // Update
        matrixList.get(0).set(1, 100);

        // Number of rows
        int rowCount = matrixList.size();

        // Number of columns in a row
        int colCount = matrixList.get(0).size();


        // ============================================================
        // 10. CREATE FIXED-SIZE 2D ARRAYLIST
        // ============================================================

        int R = 3;
        int C = 4;

        ArrayList<ArrayList<Integer>> gridList = new ArrayList<>();

        for (int i = 0; i < R; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < C; j++) {
                row.add(0);
            }

            gridList.add(row);
        }

        // Access
        gridList.get(1).get(2);

        // Update
        gridList.get(1).set(2, 50);

        // Traverse
        for (ArrayList<Integer> row : gridList) {
            for (int value3 : row) {
                System.out.print(value3 + " ");
            }
            System.out.println();
        }
    }
}