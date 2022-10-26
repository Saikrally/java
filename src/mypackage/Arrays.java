package mypackage;

public class Arrays {
    public static void main(String[] args) {
        String[] names;
        names = new String[3];
        String[] name = new String[3];
        int[] arr = new int[10];
        name[0] = "Vasya";
        name[1] = "Petro";
        name[2] = "Dmytro";
        System.out.println(java.util.Arrays.toString(name));
       /* int[] array = {15,10,25,30,5};
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]); */

        int[] arr2 = new int[15];
        for (int j = 0; j < 15; j++){
            arr2[j] = j * 10;
            System.out.println(arr2[j]);
            System.out.println(arr2.length);
            System.out.println(arr2[arr2.length - 1]);
        }
        }

    }

