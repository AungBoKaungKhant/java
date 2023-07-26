package array;

public class TwoORMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] num = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println(num[1][1]);

        num[1][1] = 17;

        System.out.println(num[1][1]);


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + "\t");
            }

            // for each loop
            for (int[] nbs : num) {
                for (int n : nbs) {
                    System.out.print(n + "\t");
                }
                System.out.println();
            }


        }

    }

}
