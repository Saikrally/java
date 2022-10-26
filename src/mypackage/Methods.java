package mypackage;

public class Methods {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int sum;
        sum = getSum(a,  b);
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(getSum(2, 15));

        showSum(10, 51, 77);
        showSum(25, 50, 102);
        saySmth();
        sayHello("Petr");
        String name = "Vasya";
        sayHello(name);
        showSumToPerson("Vanya", 15, 12, 35);
        int result;
        result = getSum(1, 10);
        System.out.println(result);
        result = getSum(5, 100, 66);
        System.out.println(result);

        sayHello("Petya");
        sayHello("Vasya", "Vanya");
        sayHello();
        int [] array = {1, 22, 52, 34, 16};
        System.out.println(getSum(array, "Oleg"));

    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return (sum);
    }

    static int getSum(int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }

    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return (sum);
    }

    static void showSum(int x, int y, int z){
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }
    static void saySmth() {
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I'm running!");
        System.out.println("You see me!");
        System.out.println();
    }
    static void sayHello(String name) {

        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
        System.out.println();
    }
    static void sayHello(String name1, String name2) {

        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
        System.out.println();
    }
    static void sayHello() {

        System.out.println("Hello!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
        System.out.println();
    }
    static void showSumToPerson(String name, int a, int b, int c){
        System.out.println();
        System.out.println("Start of program!");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program!");
    }
}
