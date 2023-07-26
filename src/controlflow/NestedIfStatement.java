package controlflow;

public class NestedIfStatement {
    public static void main(String[] args) {

        int a = 10;

        if (a < 11) {
            int b = 20;
            if (b > 20) {
                System.out.println("b is greater than a");
            } else if (b == a) {
                System.out.println("b is equal to a");
            } else {
                System.out.println("b is equal to 20");
            }
        } else {
            System.out.println("a is not less than 11");

        }
    }
}
