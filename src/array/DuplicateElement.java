package array;

public class DuplicateElement {
    public static void main(String[] args) {

        int numbers [] = {1,2,3,1,4,5,2,6,4};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    System.out.print(numbers[j]+"\t");
                }
            }
        }

    }
}


