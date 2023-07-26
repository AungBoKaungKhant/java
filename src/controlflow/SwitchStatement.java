package controlflow;

public class SwitchStatement {
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                System.out.println(a +" is equal to 1");
                System.out.println("something");
                break;
            case 2:
                System.out.println(a + " is equal to 2");
                break;
            case 3:
                System.out.println(a + " is equal to 3");
                break;
            case 4:
                System.out.println(a + " is equal to 4");
                break;
            case 5:
                System.out.println(a + " is equal to 5");
        }
    }
}


/**
 *switch case
 * switch (){
 *     case ဖြစ်ချင်တဲ့အခြေအနေ/စစ်ချင်တဲ့အခြေအနေ :
 *     default: 
 * }
 */