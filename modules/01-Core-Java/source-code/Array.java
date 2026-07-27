public class Array {
    public static void main(String[] args){
        int arr [] = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        int arr1 [] = new int [5];
        arr1[2] = 45; 
        System.out.println(arr1[2]);
        int arr2 [][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[1][2]);
        int arr3 [][] = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arr3 [i][j] = (int)(Math.random()*10);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr3 [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Enhanced for loop
        for(int n[] : arr3){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    // Jagged Array:
    
}
