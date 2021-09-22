package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW", "black", 2012);
        System.out.println("This is: " + motorbike.getModel() + "\n" + "color: " +  motorbike.getColor() + "\n" + "year manufactured: " +  motorbike.getYearOfManufactured());

    }
}
