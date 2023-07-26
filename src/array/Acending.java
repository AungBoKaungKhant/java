package array;

public class Acending {
    public static void main(String[] args) {

        int num [] = {7,5,4,2,20,10};
        int valueNow = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++){
                if (num[i] > num[j]){
                    valueNow = num[i];
                    num[i] = num[j];
                    num[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println();

        int newValue = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++){
                if (num[i] < num[j]){
                    newValue = num[j];
                    num[j] = num[i];
                    num[i] = newValue;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
    }
}
