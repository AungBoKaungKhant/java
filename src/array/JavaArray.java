package array;

public class JavaArray {
    public static void main(String[] args) {

        String [] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
        int [] num = {12,30,49,100,15};
        System.out.println(cars.length);
        System.out.println(cars[1]);
        cars[1]= "Suzuki";
        System.out.println(cars[1]);
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+"\t");
         }
        System.out.println();

        int a[] = new int[5];
        a[0] = 1;
        a[1] = 4;
        a[3] = 7;
        a[4] = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");


        }
        System.out.println();

        //output array with for each loop
        for (int b : a) {
            System.out.print(b+("\t"));
        }

        System.out.println();

        //Array reverse (forr)
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]+"\t");
        }



        }
    }


//Array