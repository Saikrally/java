package mypackage;

public class Conditions {
    public static void main(String[] args) {
        int i = 16;


        System.out.println("Start of program");
        if (i > 15) {
            System.out.println("i > 15");
            i ++;
            System.out.println("i = " + i);
        } else if (i < 10 && i >5) {
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println("i = " + i);
        }
        else {
            System.out.println("i > 10");
        }
        System.out.println("End of program");
        i = 10;
        switch (i){
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("I don't know the number");
        }


}}
