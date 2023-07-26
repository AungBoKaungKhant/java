package array;

public class ArrayCopy {
    public static void main(String[] args) {

        int numbers [] = {1,2,3,4,5,6};

        int other[] = new int[7];
        System.arraycopy(numbers, 0, other, 1, 5);

        for (int i = 0; i < other.length; i++) {
            System.out.println(other[i]);
        }

    }
}
