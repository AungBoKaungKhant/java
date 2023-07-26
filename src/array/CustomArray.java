package array;

public class CustomArray {
    public static void main(String[] args) {

        //initialize
        int numbers [] = {1,2,4,5,3,6,9};

        int copy[] = new int[numbers.length];

        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }

        System.out.println();

        //After copy
        for (int i = 0; i < numbers.length; i++) {
            copy[i]=numbers[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }

    }
}
