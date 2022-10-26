package mypackage;

public class StringClass {
    public static void main(String[] args) {
       String s = "Hello world";
        System.out.println(s.equals("Hello world"));
        System.out.println(s.equals("Hello"));
        s = "hello,world";
        String [] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);
        int age = 30;
        String name = "Ivan";
        String str = "My name is " + name + " I'm " + age + " years old!";
        System.out.println(str);
        String age2 = "30";
        System.out.println(age2.getClass());
        int a = Integer.parseInt(age2);
        System.out.println(a);
        String string = "Test string";
        System.out.println(string.substring(1,5));
        System.out.println(string.substring(1));
    }

}
