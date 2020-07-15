package problems;

public class Average2DArray {

    public static void main(String[] args) {

        int[][] matrix = { {2, 3, 7}, {1, 2, 3}};
        double total;
        double max = Double.MIN_VALUE;

        for(int[] row : matrix){
            total = 0;
            for(int num: row){
                total += num;
            }
            if (total/row.length > max){
                max = total/row.length;
            }
        }

        System.out.println(max);
    }
}
