package array;

public class ArrayClone {
    public static void main(String[] args) {

        int num [] = {1,2,3,4,4,5};

        int another [] = num.clone();

        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");
        }



    }
}
