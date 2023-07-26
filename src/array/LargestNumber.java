package array;

public class LargestNumber {
    public static void main(String[] args) {

        int numbers[] = {12, 12, 14, 15, 1, 22, 30};

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println();

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
        }

        System.out.println(min);
    }
}
