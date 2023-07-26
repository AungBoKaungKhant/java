package controlflow;

public class WhileLoopStatement {
    public static void main(String[] args) {
        //while (condition) //if condition true do work
        //don't forget __++

        int a = 5;
        while (a < 10){
            System.out.println(a);
            a++;
        }

        /**
         * do{ a yin a lote lot tel
         *
         * }while()
         */
        do {
            System.out.println(a);
            a+=2;
        }while (a < 20);

        int number = 4;
        do {
            System.out.println(number);
            number++;
        }while (number < 7);
    }
}
