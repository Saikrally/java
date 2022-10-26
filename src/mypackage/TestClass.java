package mypackage;

public class TestClass {
    public static void main(String[] args) {
        byte a = 5; // -128 -> 127
        short b = -100; //  -32768 -> 32767
        int c;
        c = 1000000;
        long d = -12323324;
        System.out.println("byte a = " + a);
        System.out.println("short b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);
        double double1 = 133.144;
        System.out.println("double double1: " + double1);
        float float1 = 150.32f;
        System.out.println("float variable: " + float1);
        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println("boolean1 is " + boolean1);
        System.out.println("boolean2 is " + boolean2);
        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println(boolean3);
        System.out.println(boolean4);
        String str = "Hello!";
        System.out.println(str);
    }

}