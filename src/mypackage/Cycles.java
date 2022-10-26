package mypackage;

public class Cycles {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = i * 2;
        }
        for (int i = 0; i <10; i++){
            System.out.println("Element with index " + i + "is: " + array[i]);
        }
        for (int element : array){
            System.out.println(element);
        }
        int i = 0;
        while (i < 10){
            System.out.println("While: " + i);
            i++;
        }
    }
}
