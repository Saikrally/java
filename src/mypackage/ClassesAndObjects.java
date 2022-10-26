package mypackage;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;
        car1.addWeight(50);
        car1.drive(120);
    }
}
