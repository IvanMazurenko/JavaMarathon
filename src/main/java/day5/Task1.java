package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("mercedes");
        car.setYearOfManufactured(2020);
        System.out.println("This is : " + car.getModel() + "\n" + "color: " + car.getColor() + "\n" + "year manufactured: " + car.getYearOfManufactured());

    }
}
