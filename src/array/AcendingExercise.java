package array;

public class AcendingExercise {
    public static void main(String[] args) {

        int num [] = {1,29,23,14,5,8,0};

        int newValue = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++){
                if (num [i] > num[j]){
                    newValue = num[i];
                    num[i] = num[j];
                    num[j] = newValue;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }

        System.out.println();

        int valueNow = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i +1; j < num.length; j++){
                if (num[i] < num[j]){
                    valueNow = num[i];
                    num[i] = num[j];
                    num[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
    }
}
