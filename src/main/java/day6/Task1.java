package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("mercedes");
        car.setColor("red");
        car.setYear(1985);
        Motorbike motorbike = new Motorbike("BMW", "black", 2020);
        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2021));
        System.out.println(motorbike.yearDifference(2021));
    }
}
